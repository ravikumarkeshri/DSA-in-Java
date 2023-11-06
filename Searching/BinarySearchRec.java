package Searching;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchRec {
    public void PrintArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public boolean binarySearchRecc(int[] arr, int size , int search){
        int startIndex = 0;
        int endIndex = size -1 ;
        return binarySearchReccUtil(arr, startIndex,endIndex, search);
    }


    private boolean binarySearchReccUtil(int[] arr, int startIndex, int endIndex, int search) {
        
        if (startIndex > endIndex) {
            return false;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        if (arr[mid] == search) {
            return true;
        } else if (arr[mid] > search) {
            return binarySearchReccUtil(arr, startIndex, mid - 1, search);
        } else {
            return binarySearchReccUtil(arr, mid + 1, endIndex, search);
        }

    }
    public int binarySearchReccIndex(int[] arr, int size , int search){
        int startIndex = 0;
        int endIndex = size -1 ;
        return binarySearchReccIndexMethod(arr, startIndex,endIndex, search);
    }


    private int binarySearchReccIndexMethod(int[] arr, int startIndex, int endIndex, int search) {
        
        if (startIndex > endIndex) {
            return -1;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        if (arr[mid] == search) {
            return mid;
        } else if (arr[mid] > search) {
            return binarySearchReccIndexMethod(arr, startIndex, mid - 1, search);
        } else {
            return binarySearchReccIndexMethod(arr, mid + 1, endIndex, search);
        }

    }

    public static void main(String[] args) {
        BinarySearchRec binary = new BinarySearchRec();
        int size = 40;
        int[] arr = new int[size];
        Random random1 = new Random();
       
        for (int i = 0; i < size; i++) {
            arr[i] = random1.nextInt(40);
        }
        int searchValue = random1.nextInt(40);
        // binary.PrintArr(arr, size);
        Arrays.sort(arr);
        binary.PrintArr(arr, size);

        // boolean isFound = binary.binarySearchReccUtil(arr, 0, size-1, 33); //can be used directily.
        // boolean isFound = binary.binarySearchRecc(arr, size, searchValue);
        // if (isFound) {
        //     System.out.println("Found");
        // } else {
        //     System.out.println("Not found");
        // }

        int index = binary.binarySearchReccIndex(arr, size, searchValue);
        if(index==-1){
            System.out.println(searchValue + " not found");
        }else{
            System.out.println(searchValue+ " Found at Position : "+(index+1) );
        }
        
    }
}
