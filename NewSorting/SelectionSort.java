import java.util.Random;

public class SelectionSort {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void SelectionSortMethod(int[] arr , int size){
        for (int i = 0; i<size-1 ; i++){
            int minIndex = i;
            for(int j = i+1 ; j<size ; j++){
                if(arr[j] <arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort sSort = new SelectionSort();
        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(30);
        }
       sSort.printArr(arr,size);
       sSort.SelectionSortMethod(arr, size);
       sSort.printArr(arr, size);

    }
}
