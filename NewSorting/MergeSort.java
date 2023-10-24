import java.util.Random;

public class MergeSort {
    public void printArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
  
    private  void mergeSort(int[] arr ){
         int size = arr.length;
        if(size<2){
            return;
        }       
        int mid = size/2;
        int left[] = new int[mid];
        int right[] = new int[size-mid];
        System.arraycopy(arr,0,left,0,mid);
        System.arraycopy(arr,mid,right,0,size-mid);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
    private void merge(int[] arr, int[] left, int[] right){
        int i =0 ,  j=0, k=0;
        while(i<left.length && j<right.length){
            if(left[i] <= right[j] ){
                arr[k++]= left[i++];             
            }else{
                arr[k++] = right[j++];              
            }           
        }
        while(i<left.length){
            arr[k++] = left[i++];         
        }
        while(j<right.length){
            arr[k++] = right[j++];           
        }
    }

    private void new_mergeSort(int[] arr, int[] tempArr, int lowerIndex, int upperIndex){
        if(lowerIndex>=upperIndex){
            return;
        }
        int middleIndex = lowerIndex + (upperIndex-lowerIndex)/2;
        new_mergeSort(arr, tempArr, lowerIndex, middleIndex);
        new_mergeSort(arr, tempArr, middleIndex+1, upperIndex);
        new_merge(arr, tempArr, lowerIndex, middleIndex, upperIndex);
    }
    private void new_merge(int[] arr, int[] tempArr, int lowerIndex, int middleIndex, int upperIndex){
        int lowerStart = lowerIndex;
        int lowerStop = middleIndex;
        int upperStart = middleIndex+1;
        int upperStop = upperIndex;
        int count = lowerIndex;

        while(lowerStart<= lowerStop && upperStart<= upperStop){
            if(arr[lowerStart]< arr[upperStart]){
                tempArr[count++] = arr[lowerStart++];
            }else{
                tempArr[count++] = arr[upperStart++];
            }
        }
        while(lowerStart<=lowerStop){
            tempArr[count++] = arr[lowerStart++];
        }
        while(upperStart<= upperStop){
            tempArr[count++] = arr[upperStart++];
        }
        for(int i = lowerIndex ; i<= upperIndex; i++){
            arr[i] = tempArr[i];
        }
    }
    public void sort(int[] arr){
        int size = arr.length;
        int[] tempArr = new int[size];
        new_mergeSort(arr, tempArr,0, size-1);

    }

    public static void main(String[] args) {
        MergeSort mSort = new MergeSort();
         int size = 10;
        int arr[] = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(30);
        }
        mSort.printArr(arr, size);
        mSort.mergeSort(arr);
        // mSort.sort(arr);
        mSort.printArr(arr, size);
    }
}
