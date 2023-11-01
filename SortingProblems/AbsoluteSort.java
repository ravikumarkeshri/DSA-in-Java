// Problem: Sort array according to the absolute difference from the given
// value.

import java.util.Random;

public class AbsoluteSort {
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

    public boolean AbsMore(int value1, int value2, int ref) {
        return (Math.abs(value1 - ref) > Math.abs(value2 - ref));
    }

    public void AbsoluteSortMethod(int[] arr, int size, int ref) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (AbsMore(arr[j], arr[j + 1], ref))
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        AbsoluteSort abSort = new AbsoluteSort();

        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(40);
        }
        abSort.printArr(arr, size);
        abSort.AbsoluteSortMethod(arr, size, arr[2]);
        abSort.printArr(arr, size);
    }
}
