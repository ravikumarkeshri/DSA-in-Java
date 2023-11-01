// Problem: Given an array containing 0s and 1s. Write an algorithms to sort
// array so that 0s come first followed by 1s. Also find the minimum number
// of swaps required to sort the array.

package SortingProblems;
import java.util.Random;

public class Partition_0_and_1 {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public void sort_0_1(int arr[] , int size){
       int left = 0;
       int right = size-1;
       int count = 0;
       while(left<right){
        while(arr[left]==0){
            left++;
        }
        while(arr[right] == 1){
            right--;
        }
        if(left<right){
            swap(arr, left, right);
            count++;
        }
       }
       System.out.println(" swaps count: "+count);
    }
  
    public static void main(String[] args) {
        Partition_0_and_1 partition = new Partition_0_and_1();
        int min= 0;
        int max = 1;

        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for(int i = 0 ; i< size; i++){
            arr[i] = r.nextInt(max- min +1) + min;
        }
        partition.printArr(arr, size);
        partition.sort_0_1(arr, size);
        partition.printArr(arr, size);
        
    }
}
