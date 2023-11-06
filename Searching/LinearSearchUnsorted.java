package Searching;

import java.util.Random;

public class LinearSearchUnsorted {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean linearSearchUnsorted_boolean_Method(int[] arr, int size, int search) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                return true;
            }
        }
        return false;
    }

    public int linearSearchUnsorted_index_Method(int[] arr, int size, int search) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearchUnsorted lSearch = new LinearSearchUnsorted();
        int size = 20;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(40);
        }
        int value = r.nextInt(40);
        lSearch.printArr(arr, size);
        System.out.println("Random Generated Value: " + value);
        // if(lSearch.linearSearchUnsorted_boolean_Method(arr,size,value)){
        // System.out.println("Value Found");
        // }else{
        // System.out.println("Not found");
        // }
        int index = lSearch.linearSearchUnsorted_index_Method(arr, size, value);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("found at Position: " + (index + 1));
        }

    }
}
