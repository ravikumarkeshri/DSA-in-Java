import java.util.Random;


public class QuickSelect {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void quickSelectMethod(int[] arr, int lower, int upper, int index) {
        if (upper <= lower) {
            return;
        }
        int pivot = arr[lower];
        int start = lower;
        int stop = upper;
        while (lower < upper) {
            while (arr[lower] <= pivot && lower < upper) {
                lower++;
            }
            while (arr[upper] > pivot && lower <= upper) {
                upper--;
            }
            if (upper > lower) {
                swap(arr, upper,lower);
            }

        }
        swap(arr, upper, start);
       
        if (index < upper) {
            quickSelectMethod(arr, start, upper - 1, index);
        }
        if (index > upper) {
            quickSelectMethod(arr, upper + 1, stop, index);
        }
    }

    public int getElement(int[] arr, int index) {
        quickSelectMethod(arr, 0, arr.length-1, index);
        return arr[index - 1];
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        QuickSelect qSelect = new QuickSelect();
        QuickSort qSort = new QuickSort();

        int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(30);
        }
        // int index = r.nextInt(10);
        qSelect.printArr(arr, size);
        qSort.sort(arr);
        qSelect.printArr(arr, size);

        System.out.println(qSelect.getElement(arr, 6));
        
        // System.out.println("Element at "+index+" is "+ qSelect.getElement(arr,index));
    }
}
