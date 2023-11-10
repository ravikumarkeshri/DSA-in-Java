package LinkedList;

import java.util.LinkedList;
import java.util.Random;

public class SingleLinkedList {
    private static class Node {
        private int value;
        private Node next;

        public Node(int v, Node n) {
            value = v;
            next = n;
        }

    }

    private Node head;
    private int size = 0;

    public void addHead(int value) {
        head = new Node(value, head);
        size++;
    }

    public void addTail(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void PrintList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void sortedInsert(int value) {
        Node newNode = new Node(value, null);
        Node curr = head;
        if (curr == null || curr.value > value) {
            newNode.next = head;
            head = newNode;
            return;
        }
        while (curr.next != null && curr.next.value < value) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }
    public boolean searchList(int value){
        if(head == null){
            return false;
        }
        Node curr = head;
        while(curr != null){
            if(curr.value == value){
                return true;               
            }
            curr  = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // Random r = new Random();
        SingleLinkedList list = new SingleLinkedList();
        {
            // list.addHead(2);
            // list.addHead(3);
            // list.addHead(7);
            // list.addHead(2);
            // list.addHead(13);
            // list.addHead(17);
            // list.addHead(21);
            // list.addHead(33);
            // list.addHead(72);
            // list.PrintList();
        }

        {
            list.sortedInsert(4);
            list.sortedInsert(6);
            list.sortedInsert(10);
            list.sortedInsert(2);
            list.sortedInsert(14);
            list.sortedInsert(61);
            list.sortedInsert(20);
            list.sortedInsert(23);
            list.sortedInsert(42);
            list.sortedInsert(16);
            list.sortedInsert(15);
            list.sortedInsert(26);
            list.PrintList();
            System.out.println(list.searchList(10));
        }
    }

}
