// Problem: Given an array containing 0s, 1s and 2s. Write an algorithms to
// sort array so that 0s come first followed by 1s and then 2s in the end.

import java.util.Random;

public class Partition_0_1_2 {
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
    public void sort_0_1_2(int[] arr, int size){
        int left = 0;
        int right = size-1;
        int i = 0;
        int count =0;
        while(i<=right){
            if(arr[i] == 0){
                swap(arr, left, i);
                i++;
                left++;
                count++;
            }
            else if(arr[i] == 2){
                swap(arr,i, right);
               
                right--;
                count++;
            }
            else{
                i++;
            }
        }
        System.out.println("swap counts: "+ count);
    }
    public static void main(String[] args) {
       Partition_0_1_2 partition = new Partition_0_1_2();
       int size = 20;
       int min = 0;
       int max= 2;
       int arr[] = new int[size];
       Random r = new Random();
       for(int i= 0; i<size ; i++){
        arr[i] = r.nextInt(max-min+1)+min;
       }
       partition.printArr(arr, size);
       partition.sort_0_1_2(arr, size);
       partition.printArr(arr, size);
        
    }
}
