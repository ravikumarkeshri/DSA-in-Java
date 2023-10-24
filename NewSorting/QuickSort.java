import java.util.Random;

public class QuickSort {
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
    private void quickSortMethod(int[] arr, int lower, int upper){
        if(upper<= lower){
            return;
        }
        int pivot = arr[lower];
        int start = lower;
        int stop = upper;
        while(lower<upper){
            while(arr[lower] <= pivot && lower < upper){
                lower++;
            }
            while(arr[upper] > pivot && lower<= upper){
                upper--;
            }
            if(lower<upper){
                swap(arr, upper, lower);
            }
        }
        swap(arr, upper, start);
        quickSortMethod(arr, start, upper-1);
        quickSortMethod(arr, upper+1, stop );
    }
    public void sort(int[] arr ){
        int size = arr.length;
        quickSortMethod(arr, 0, size-1);
    }
    public static void main(String[] args) {
        QuickSort qSort = new QuickSort();
        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(30);
        }
        qSort.printArr(arr, size);
        qSort.sort(arr);
        qSort.printArr(arr, size);
        
    }
}
