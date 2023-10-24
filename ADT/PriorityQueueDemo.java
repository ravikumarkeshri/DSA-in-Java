package JavaBook.ADT;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String args[]){
        PriorityQueue<Integer> pque = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i =1;i<6;i++){
            pque.add(i*3);

        }   
        System.out.println(pque);
        while(pque.isEmpty()==false){
            System.out.println(pque.remove()+" ");
            System.out.println(pque);
        }
    }
}
