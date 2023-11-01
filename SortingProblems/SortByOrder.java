// Problem: Given two array, sort first array according to the order defined in
// second array.

import java.util.HashMap;
import java.util.Random;

public class SortByOrder {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public void sortByOrderMethod(int[] arr1, int size1, int[] arr2, int size2) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        int value;
        for (int i = 0; i < size1; i++) {
            if (ht.containsKey(arr1[i])) {
                value = ht.get(arr1[i]);
                ht.put(arr1[i], value + 1);
            } else {
                ht.put(arr1[i], 1);
            }
        }
        for (int j = 0; j < size2; j++) {
            if (ht.containsKey(arr2[j])) {
                value = ht.get(arr2[j]);
                for (int k = 0; k < value; k++) {
                    System.out.print(" "+arr2[j]);
                }
                ht.remove(arr2[j]);
            }
        }
        for (int i = 0; i < size1; i++) {
            if (ht.containsKey(arr1[i])) {
                value = ht.get(arr1[i]);
                for (int k = 0; k < value; k++) {
                    System.out.print(" "+ arr1[i]);
                }
                ht.remove(arr1[i]);
            }

        }
    }

    public static void main(String[] args) {

        int size1 = 10;
        int size2 = 4;
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        Random r1 = new Random();
        Random r2 = new Random();
        for (int i = 0; i < size1; i++) {
            arr1[i] = r1.nextInt(10);
        }
        for(int i = 0; i<size2 ; i++){
            arr2[i] = r2.nextInt(10);
        }

        SortByOrder order = new SortByOrder();
        order.printArr(arr1, size1);
        order.printArr(arr2, size2);
        System.out.println();
        order.sortByOrderMethod(arr1, size1, arr2, size2);

    }
}
