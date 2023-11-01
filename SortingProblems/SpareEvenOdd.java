
// Problem: Given an array of even and odd numbers, write a program to
// separate even numbers from the odd numbers.
import java.util.Random;

public class SpareEvenOdd {
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
    public void spareEvenOddMethod(int[] arr, int size){
        int left = 0 , right = size-1;
        while(left<right){
            if(arr[left] % 2 == 0){
                left++;
            }else if(arr[right] % 2 == 1){
                right--;
            }
            else{
                swap(arr, left, right);
                left++;
                right--;
            }

        }
    }

    public static void main(String[] args) {
        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(40);
        }
        SpareEvenOdd s= new SpareEvenOdd();
        s.printArr(arr, size);
        s.spareEvenOddMethod(arr, size);
        s.printArr(arr, size);
    }
}
