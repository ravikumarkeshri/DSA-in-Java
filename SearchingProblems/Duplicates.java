// Problem: Given an array of n numbers, print the duplicate elements in the
// array.
// Time Complexity is O(n2) and Space Complexity is O(1)
package SearchingProblems;

import java.sql.Time;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Duplicates {
    public void PrintArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public void printRepeating(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(" " + arr[i]);
                }
            }
        }
        // Time Complexity is O(n2) and Space Complexity is O(1)
    }

    // In Single Scan
    public void printRepeating2(int[] arr, int size) {
        Arrays.sort(arr);
        for (int i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(" " + arr[i]);
            }
        }
        // Time Complexity is O(n log n) and Space Complexity is O(1)
    }

    public void printRepeating3(int[] arr, int size) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < size; i++) {
            if (set.contains(arr[i])) {
                System.out.print(" " + arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
    }

    public void printRepeating4(int[] arr, int size) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                map.put(arr[i], count+1);
               
            } else {
                map.put(arr[i], 1);
            }
             
        }
        for(int i = 0; i<size;i++){
            if(map.get(arr[i]) == 1){
                map.remove(arr[i]);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
           System.out.println(key +" -> " +value);
        }

        // time complexity of the algorithm is O(n) time. Space Complexity is also O(n)
    }

    public static void main(String[] args) {
        Duplicates dup = new Duplicates();
        int size = 20;
        int[] arr = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(20);
        }
        dup.PrintArr(arr, size);
        System.out.println("Duplicate Elements are: ");
        // dup.printRepeating(arr, size);
        // dup.printRepeating2(arr, size);
        // dup.printRepeating3(arr, size);

        // this is the optimal and better (i think) way to find the number of occurance of elements
        dup.printRepeating4(arr, size);


    }

}
