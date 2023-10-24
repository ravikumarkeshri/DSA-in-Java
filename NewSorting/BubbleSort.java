import java.util.Random;

public class BubbleSort {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void SortMethod1(int[] arr, int size) {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void SortMethod2(int[] arr, int size) {
        int temp, swapped = 1;
        for (int i = 0; i < size && swapped == 1; i++) {
            swapped = 0;
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();
        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(30);
        }

        bSort.printArr(arr, size);

        // bSort.SortMethod1(arr,size);
        bSort.SortMethod2(arr, size);

        bSort.printArr(arr, size);
    }
}
