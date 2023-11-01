// Problem: Minimum swaps required to bring all elements less than given
// value together at the start of array.


import java.util.Random;

public class MinimumSwaps {
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
    public int MinimumSwapMethod(int[] arr, int size ,int value){
        int swapcounts = 0;
        int start = 0;
        int end = size-1;
        
        while(start<end){
            if(arr[start]<=value){
                start++;
            }
            else if(arr[end]> value){
                end--;
            }
            else{
                swap(arr, start, end);
                swapcounts++;
            }
        }
        return swapcounts;
    }

    public static void main(String[] args) {
        MinimumSwaps minSwap = new MinimumSwaps();
        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(40);
        }
        minSwap.printArr(arr, size);
        int value = 20;
        int swapcounts = minSwap.MinimumSwapMethod(arr, size, value);
        System.out.println("Swaps needed : " + swapcounts);
    }
}
