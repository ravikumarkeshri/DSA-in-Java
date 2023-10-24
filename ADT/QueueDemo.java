package JavaBook.ADT;

import java.util.ArrayDeque;

public class QueueDemo {
    public static void main(String ar[]){
       ArrayDeque<Integer> q = new ArrayDeque<Integer>();
       for (int i = 0; i<10; i++){
        q.add(i*3);
       }
       System.out.println("Befor : ");
       System.out.println(q);
       System.out.println("After operations:> ");
       System.out.println(q.size());
       System.out.println(q);

    }
}
