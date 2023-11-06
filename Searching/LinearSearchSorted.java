package Searching;

import java.util.Arrays;
import java.util.Random;

public class LinearSearchSorted {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean boolean_method(int[] arr, int size, int search) {
        if (search < arr[0] || search > arr[size - 1]) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (search == arr[i]) {
                return true;
            }
        }
        return false;

    }

    public int index_method(int[] arr, int size, int search) {
        if (search < arr[0] || search > arr[size - 1]) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (search == arr[i]) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        LinearSearchSorted lSearch = new LinearSearchSorted();
        int size = 20;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(40);
        }

        System.out.println("Array before Sorting...");
        lSearch.printArr(arr, size);
        Arrays.sort(arr);
        System.out.println("\nArrya after Sorting...");
        lSearch.printArr(arr, size);
        System.out.println();
        int value = r.nextInt(50);
        System.out.println("Random Generated Value: " + value);

        boolean result = lSearch.boolean_method(arr, size, value);
        // if (result) {
        //     System.out.println("Value Found");
        // }else{
        //     System.out.println("Value Not Found");
        // }

        int index = lSearch.index_method(arr, size, value);
        if(index == -1){
              System.out.println("Value Not Found");
        }
        else{
            System.out.println("Value found at position: " + (index+1));
        }

    }
}
