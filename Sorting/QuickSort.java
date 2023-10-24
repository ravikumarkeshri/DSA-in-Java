package JavaBook.Sorting;

public class QuickSort {
    private void Q_sort(int array[], int lower, int upper){
        if (upper<= lower){
            return;
        }
        int pivot = array[lower];
        int start = lower;
        int stop = upper;
        while (lower < upper){
            while(array[lower]<= pivot && lower <upper){
                lower++; 

            }
            while(array[upper]>pivot && lower<= upper){
                upper--;
            }
            if(lower<upper){
                swap(array, upper, lower);
            }
        }
        swap(array, upper, start);
        Q_sort(array, start, upper-1);
        Q_sort(array, upper+1, stop);
    }
    private void sort(int array[]){
        int size = array.length;
        Q_sort(array, 0, size-1);
    }
    private void swap(int array[], int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    private static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
       
    }
    public static void main(String args[]){
        int[] array ={8,5,7,9,9,3,9,1,5,7};
        QuickSort q = new QuickSort();
        q.sort(array);
        q.print(array);

        
    }
}
