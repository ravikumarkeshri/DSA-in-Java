package Searching;

import java.util.Arrays;
import java.util.Random;

public class Binarysearch_Iterative {
    public void PrintArr(int[] arr , int size){
        for(int i = 0 ; i<size ; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public boolean binarySearch(int[] arr, int size , int search ){
        int mid ;
        int start = 0;
        int end = size-1;
        while(start <= end){
             mid = start + (end-start)/2;
            if(arr[mid] == search){
                return true;
            }
            else if(arr[mid]>search){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return false;
       
    }
    public static void main(String[] args) {
        Binarysearch_Iterative binary = new Binarysearch_Iterative();
        int size = 10;
        int[] arr = new int[size];
        Random random = new Random();
        for(int i = 0; i<size ;i++){
            arr[i] = random.nextInt(40);
        }
        binary.PrintArr(arr, size);
        Arrays.sort(arr);
        binary.PrintArr(arr, size);

        boolean isFound = binary.binarySearch(arr, size, 33);
       if(isFound){
        System.out.println("Found");
       }else{
        System.out.println("Not found");
       }
        
        
    }
}
