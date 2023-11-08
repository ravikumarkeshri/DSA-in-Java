package SearchingProblems;


import java.util.Arrays;
import java.util.HashSet;

import java.util.Random;

public class RemoveDuplicates{
    public void PrintArr(int[] arr, int size ){
        for(int i = 0; i<size; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
    }
    public void removeDuplicatesMethod(int[] arr, int size){
        // int temp[] = new int[size];
        HashSet <Integer> ht  = new HashSet <Integer>();
        for(int i = 0 ;i<size ; i++){
            if(ht.contains(arr[i])){
                ht.remove(arr[i]);
            }
            else{
                ht.add(arr[i]);
                System.out.print(" "+arr[i]);
               
            }
        }
        System.out.println();
        
       
    }
    public int[] removeDuplicatesMethod2(int[] arr, int size){
        int j = 0;
        int i;
        Arrays.sort(arr);
        for(i = 1 ; i<size; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
                
            }
        }
        int[] temp = Arrays.copyOf(arr, j+1);
        return temp;
        // Overall Time Complexity = O(nlogn).
    }
    //  public int[] removeDuplicatesMethod1(int[] arr, int size){
    //     int temp[] = new int[size];
    //     int counter = 0;
    //     HashSet <Integer> ht  = new HashSet <Integer>();
    //     for(int i = 0 ;i<size ; i++){
    //         if(ht.contains(arr[i])){
    //             ht.remove(arr[i]);
    //         }
    //         else{
    //             ht.add(arr[i]);
               
    //             temp[counter++] = arr[i];
                
               
    //         }
    //     }
    //     System.out.println();
    //     return temp;
       
    // }
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int size = 20;
        int arr[] = new int[size];
        int[] temp1 = rd.removeDuplicatesMethod2(arr,size);
        Random r = new Random();
        for(int i = 0; i<size; i++){
            arr[i] = r.nextInt(40);
        }
        System.out.println();
        rd.PrintArr(arr, size);
        // rd.removeDuplicatesMethod(arr, size);
        for (int number : temp1) {
            System.out.print(number + " ");
        }
       
      
        // temp = rd.removeDuplicatesMethod1(arr, size);
        
        // rd.PrintArr(temp, temp.length);
       
       


    }
}