package JavaBook.ADT;

import java.util.Stack;

public class StackDemo {
    public static void main(String args[]){
        Stack <Integer> demo = new Stack<Integer>();
        // demo.push(8);
        for(int i =0 ;i<10;i++){
            demo.push(i*4);
        }
        System.out.println("Original Stack");
        System.out.print(demo+" ");

        System.out.println("\nAfter Operations ");
        demo.pop();
       
        
        System.out.print( demo.lastElement());

            
        
    }
}
