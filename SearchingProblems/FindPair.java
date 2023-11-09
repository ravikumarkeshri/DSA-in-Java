
// Problem: Given an array of n numbers, find two elements such that their
// sum is equal to “value”
package SearchingProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;

public class FindPair {
    public void PrintArr(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void RandomNumbers(int arr[], int size) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(20);
        }
    }

    public boolean findPairMethod1(int arr[], int size, int value) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (value == arr[i] + arr[j]) {
                    System.out.println("Numbers: " + arr[i] + " and " + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findPairMethod2(int arr[], int size, int value) {
        int left = 0;
        int right = size - 1;
        int sum;
        Arrays.sort(arr);
        while (left < right) {
            sum = arr[left] + arr[right];
            if (value == sum) {
                System.out.println("Numbers: " + arr[left] + " and " + arr[right]);
                return true;
            } else if (sum < value) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public boolean findPairMethod3(int arr[], int size, int value) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < size; i++) {
            if (hs.contains(value - arr[i])) {
                System.out.println("Numbers: " + arr[i] + " and " + (value - arr[i]));
                return true;
            } else {
                hs.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FindPair fp = new FindPair();
        int size = 10;
        int arr[] = new int[size];
        fp.RandomNumbers(arr, size);
        fp.PrintArr(arr, size);
        // boolean result = fp.findPairMethod1(arr, size, 17);
        // boolean result = fp.findPairMethod2(arr, size, 17);
        boolean result = fp.findPairMethod3(arr, size, 17);
        System.out.println(result);
    }
}
