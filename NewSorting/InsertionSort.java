import java.util.Random;

public class InsertionSort {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // private boolean more(int value1, int value2) {
    //     return value1 > value2;
    // }

    public void InsertionSortMethod(int[] arr, int size){
        for(int i = 1 ; i<size ; i++){     
             int j;     
            int temp = arr[i];
            for(  j = i-1; j>=0 && arr[j] > temp; j--){
                arr[j+1]  = arr[j];
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        InsertionSort iSort = new InsertionSort();
        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(30);
        }

        iSort.printArr(arr, size);
        iSort.InsertionSortMethod(arr, size);
        iSort.printArr(arr, size);
    }
}
