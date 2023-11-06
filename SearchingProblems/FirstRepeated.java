// Problem: Given an unsorted list of n elements, find the first element, which
// is repeated.
// Time Complexity is O(n2) and Space Complexity is O(1)

package SearchingProblems;

import java.util.Random;

public class FirstRepeated {
    public void PrintArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public int findFirstRepeatedElement(int[] arr , int size){
        for(int i = 0; i<size; i++){
            for(int j=i+1; j<size ; j++){
                if(arr[i]== arr[j]){
                    return arr[i];
                }
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        FirstRepeated repeated  = new FirstRepeated();
        int size = 5;
        int[] arr = new int[size];
        Random r = new Random();
       
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(20);
        }
        repeated.PrintArr(arr, size);
        int firstRepeated = repeated.findFirstRepeatedElement(arr, size);
        if(firstRepeated == Integer.MIN_VALUE){
            System.out.println("No Element is Repeated");
        }else{
            System.out.println(firstRepeated+ " is Repeacting First");
        }
    }
}
