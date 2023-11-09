// Problem: Given an array of size N, the elements in the array may be
// repeated. You need to find sum of distinct elements of the array. If there is
// some value repeated continuously then they should be added once.

package SearchingProblems;

import java.util.Arrays;
import java.util.Random;

public class SumDistinct{
     public void PrintArr(int arr[], int size){
        for(int i = 0;i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void RandomNumbers(int arr[], int size){
        Random r = new Random();
        for(int i = 0; i< size ; i++){
            arr[i] = r.nextInt(20);
        }
    } 
    
    public int  sumDistinctMethod(int arr[] , int size){
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i<(size-1); i++){
            if(arr[i] != arr[i+1]){
                sum = sum + arr[i];
            }
        }
        sum = sum + arr[size-1];
        return sum;
        // Time Complexity of this algorithm is O(n). Space Complexity is O(1)
         
    }
    public static void main(String[] args) {
        SumDistinct sd = new SumDistinct();
        int size = 10;
        int arr[] = new int[size];
        sd.RandomNumbers(arr, size);
        sd.PrintArr(arr, size);
        int distinctsum = sd.sumDistinctMethod(arr, size);

        System.out.println("DistinctSum = "+distinctsum);
        
        
    }

   
}