package Sorting;

public class MergeSort {

    // Here we are merging the array.....

    private void merge(int array[],int tempArray[], int lowerIndex,int middleIndex, int upperIndex){
        int lowerStart = lowerIndex;
        int lowerStop = middleIndex;
        int upperStart = middleIndex+1;
        int upperStop = upperIndex;
        int count = lowerIndex;
         
        while(lowerStart <= lowerStop && upperStart <= upperStop){
            if(array[lowerStart]<array[upperStart]){
                tempArray[count++] = array[lowerStart++];
            }
            else{
                tempArray[count++] = array[upperStart++];
            }
        }
        while(lowerStart <= lowerStop){
            tempArray[count++] = array[lowerStart++];
        }
        while (upperStart<= upperStop){ 
            tempArray[count++] =array[upperStart++];
        }
        for(int i = lowerIndex; i<= upperIndex; i++){
            array[i] = tempArray[i];
        }
    }
    // here we are dividing the array..
    private void mergesort(int array[], int tempArray[], int lowerIndex , int upperIndex){
        if(lowerIndex >= upperIndex)
        return;

        int middleIndex = (lowerIndex + upperIndex)/2;
        mergesort(array, tempArray, lowerIndex, middleIndex);
        mergesort(array, tempArray, middleIndex+1, upperIndex);
        merge(array, tempArray, lowerIndex, middleIndex, upperIndex);
    }
    private void sort(int array[]){
        int size = array.length;
        int tempArray[] = new int[size];
        mergesort(array, tempArray, 0, size-1);
    }
    private static void print(int array[]){
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
       
    }
    public static void main(String args[]){
        System.out.println("Merge Sort Impelementing");
        int[] array ={8,5,7,9,9,3,9,1,5,7};
        MergeSort msort = new MergeSort();
        msort.sort(array);
        msort.print(array);
    }
}
