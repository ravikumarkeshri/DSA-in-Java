// Problem: Given an array of integer and a range. Write an algorithms to
// partition array so that values smaller than range come to left, then values
// under the range followed with values greater than the range.

import java.util.Random;

public class RangePartition {
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
    public void RangePartitionMethod(int[] arr, int min, int max ){
        int size = arr.length;
        int left = 0;
        int right = size-1;
        int i = 0;
        while(i <= right){
           if(arr[i]<min){
            swap(arr, left, i);
                i++;
                left++;
            }
            else if(arr[i]>max){
                swap(arr, i, right);
                right--;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        RangePartition range = new RangePartition();
        int size = 20;
        int arr[]  = new int[size];
        Random r = new Random();
        for(int i = 0; i<size ; i++){
            arr[i] = r.nextInt(40);
        }
        range.printArr(arr, size);
        range.RangePartitionMethod(arr,15, 35);
        range.printArr(arr, size);
    }
    
}
