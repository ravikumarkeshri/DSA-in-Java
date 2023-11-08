package SearchingProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class MissingNumber {
    public void PrintArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public void PrintNumbers(int[] arr, int size) {
        for (int i = 0; i < size; i++) {

            if (i == 8) {
                continue;
            } else {
                arr[i] = i;
            }
        }
    }

    public int missingNumberMethod1(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return Integer.MAX_VALUE;

    }

   public void missingNumberMethod2(int[] arr , int size){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for(int num :arr){
        if(num<min){
            min= num;
        }
        if(num>max){
            max = num;
        }

    }
    HashSet<Integer> hs = new HashSet<Integer>();
    for(int num : arr){
           hs.add(num);
    }
    for(int i = min; i<max ; i++){
        if(!hs.contains(i)){
            System.out.print(i+" ");
        }
    }

   }

    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();

        // {
        // int size = 10;
        // int[] numebrs = new int[size];
        // m.PrintNumbers(numebrs, size);
        // m.PrintArr(numebrs, size);
        // int missing = m.missingNumberMethod1(numebrs, size);
        // System.out.println("Missng numebr is : " + missing);
        // }
        {
            int size = 10;
            int[] arr = new int[size];
            Random r = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = r.nextInt(15);

            }
            System.out.println();
            m.PrintArr(arr, size);
            m.missingNumberMethod2(arr, size);

           
            
            
        }

    }
}
