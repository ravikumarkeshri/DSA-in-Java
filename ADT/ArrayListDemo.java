package JavaBook.ADT;

import java.util.ArrayList;

public class ArrayListDemo {
   
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    for (int i =0 ;i<10;i++){
        list.add(i);
    }
    // System.out.print(list);
    list.add(2, 34);
    System.out.println(list);
    System.out.println(list.isEmpty());
    System.out.println(list.size());
    list.remove(4);
    System.out.println(list);
    list.remove(3);
    System.out.println(list);
    list.removeAll(list);
    System.out.println(list);
    System.out.println(list.isEmpty());
    
    
    }
        
}
