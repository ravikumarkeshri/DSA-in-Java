import java.util.Random;

public class BucketSort {
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
    public void bucketSortMethod(int[] arr, int lowerRange, int upperRange){
        int i,j;
        int size = arr.length;
        int range = upperRange - lowerRange;
        int count[] = new int[range];
        for( i = 0 ;i<size ; i++){
            count[arr[i] - lowerRange]++;  
        }
        j = 0;
        for(i = 0; i<range ;i++){
            for(; count[i]>0 ;(count[i])--){
                arr[j++] = i + lowerRange;
            }
        }
        
    }

    public static void main(String[] args) {
        BucketSort bucketSort = new BucketSort();
        int size = 10;
        int min = 20;
        int max = 30;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(max-min+1)+min;
        } bucketSort.printArr(arr, size);
        bucketSort.bucketSortMethod(arr, min, max);
        bucketSort.printArr(arr, size);
        
    }
}