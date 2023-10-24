package JavaBook.ADT;

import java.util.LinkedList;

 

public class LinklistDemo {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for(int i = 0 ;i<10;i++){
           list.add(i*3);
           list1.add(i*4);
        }
        list.addFirst(23);
        list.addLast(22);
        list.add(2, 25);
        list.addAll(2,list1);
        list.pop();
        System.out.println(list);
    }
}