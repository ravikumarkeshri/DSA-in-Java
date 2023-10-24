package JavaBook.ADT;

import java.util.TreeSet;

public class TreeSetDemo {
 public static void main(String args[]){
    TreeSet<Integer> tset = new TreeSet<Integer>();
    for(int i = 0 ; i<6; i++){
        tset.add(i*5);
    }
    System.out.println("Befor: ");
    System.out.println(tset);
    System.out.println("\nAfter Operations: ");
    System.out.println(tset.remove(5));
    System.out.println(tset);
 }   
}
