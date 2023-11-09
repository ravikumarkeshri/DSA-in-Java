// Problem: In given List of integers, both +ve and -ve. You need to find the
// two elements such that their sum is closest to zero.

package SearchingProblems;

import java.util.Random;

public class MinAbsSumPair {
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
    public void minAbsSumPairMethod(int arr[] , int size){
        if (size < 2) {
            System.out.println("Invalid Input");
            return;
        }
        int minFirst = 0;
        int minSecond = 1;
        int left;
        int right;
        int sum = 0;
        int minSum =Math.abs( arr[0] + arr[1]);
        for(left = 0; left<(size-1) ; left++){
            for(right = left+1; right<size ; right++){
                sum = Math.abs(arr[left] + arr[right]);
                if(sum<minSum){
                    minSum = sum;
                    minFirst = left;
                    minSecond = right;
                }

            }
        }
        System.out.println("Minimum sum elements are "+ arr[minFirst] + " and "+ arr[minSecond] );
    }
    public static void main(String[] args) {
        MinAbsSumPair sp = new MinAbsSumPair();
        int size = 10;
        int arr[] = new int[size];
        sp.RandomNumbers(arr, size);
        sp.PrintArr(arr, size);
        sp.minAbsSumPairMethod(arr, size);
    }
     
}
