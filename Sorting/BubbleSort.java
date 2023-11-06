package Sorting;

public class BubbleSort {

    private boolean more(int a , int b){
        if(a>b){
            return true;
        }else{
            return false;
        }
    }

    private void sorting(int arr[]){
        for (int i =0 ;i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                if(more(arr[i], arr[j])){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void sort2(int arr[]){
        int size =arr.length;
        int i,j, temp,swapped =1;
        for(i=0; i<(size-1)  ;i++){
            // swapped =0;
            for(j=0 ; j<size -i-1 ; j++){
                if(more(arr[j],arr[j+1])){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    swapped = 1;
                }
            }
        }
    }
    public void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
       
    }
    public static void main(String args[]){
        
        System.out.println("comming soon");
        int[] array ={8,5,7,9,9,3,9,1,5,7};
        BubbleSort b = new BubbleSort();
        b.sorting(array);
        b.print(array);
        b.sort2(array);
        b.print(array);
    }
}
