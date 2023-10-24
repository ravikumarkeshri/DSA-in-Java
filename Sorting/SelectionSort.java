package JavaBook.Sorting;

public class SelectionSort {
    private static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
       
    }
    private static boolean more(int value1 , int value2){
        return value1>value2;
    }
    private static void S_sort(int arr[]){
        int size = arr.length , max; 
        for (int i = 0; i<size; i++){
             max = 0;
            for(int j =1; j<size - i; j++){
                if(more(arr[j],arr[max])){
                    max = j;
                }
                int temp = arr[size-i-1];
                arr[size-i-1] = arr[max];
                arr[max]= temp;
            }

        }
    }
    
    
    public static void main(String args[]){
        System.out.println("Selection Sort");
        int[] array ={8,5,7,9,9,3,9,1,5,7};
        S_sort(array);
        print(array);
    }
}
