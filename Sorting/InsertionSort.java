package JavaBook.Sorting;
public class InsertionSort{
    public void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
       
    }
    private boolean more(int value1 , int value2){
        return value1>value2;
    }
    public void Isort(int arr[]){
        int j;
        int size = arr.length;
        for (int i = 1; i<size;i++){
            int temp = arr[i];
            for (j = i; j>0 && more(arr[j-1],temp);j--){
                arr[j]= arr[j-1];
            }
            arr[j]= temp;
        }
    }
    public static void main(String args[]){
        System.out.println("Insertion sort");
        int[] array ={8,5,7,9,9,3,9,1,5,7};
        InsertionSort is= new InsertionSort();
        is.Isort(array);
        is.print(array);
        

    }
}