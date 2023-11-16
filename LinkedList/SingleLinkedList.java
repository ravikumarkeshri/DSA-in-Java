package LinkedList;

import java.util.LinkedList;

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
        size++;
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
            size++;
            return;
        }
        while (curr.next != null && curr.next.value < value) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;

    }

    public boolean searchList(int value) {
        if (head == null) {
            return false;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.value == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int removeHead() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("List is Empty");
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public boolean deleteNode(int deleteValue) throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("List is already Empyt");
        }
        if (head.value == deleteValue) {
            head = head.next;
            size--;
            return true;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.value == deleteValue) {
                curr.next = curr.next.next;
                size--;
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public void deleteNodes(int deleteValue) {
        if (isEmpty()) {
            System.out.println("List is already Empty");
        }
        Node currNode = head;
        Node nextNode;
        while (currNode != null && currNode.value == deleteValue) {
            head = currNode.next;
            currNode = head;
            size--;
        }
        while (currNode != null) {
            nextNode = currNode.next;
            if (nextNode != null && nextNode.value == deleteValue) {
                currNode.next = nextNode.next;
                size--;
            } else {
                currNode = nextNode;
            }
        }

    }

    public void deleteList() {
        head = null;
        size = 0;
    }

    public void reverseList() {
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;

    }

    private Node reverseRecurseUtil(Node currNode, Node nextNode) {
        Node ret;
        if (currNode == null) {
            return null;
        }
        if (currNode.next == null) {
            currNode.next = nextNode;
            return currNode;
        }
        ret = reverseRecurseUtil(currNode.next, currNode);
        currNode.next = nextNode;
        return ret;
    }

    public void reverseRecurse() {
        head = reverseRecurseUtil(head, null);
    }

    private Node reverseRecurseUtil2(Node currNode, Node prev) {
        if (currNode == null) {
            return prev;
        }
        Node nextNode = currNode.next;
        currNode.next = prev;
        return reverseRecurseUtil2(nextNode, currNode);
    }

    public void reverseRecurse2() {
        head = reverseRecurseUtil2(head, null);
    }

    public void removeDuplicate() {
        Node curr = head;
        while (curr != null) {
            if (curr.next != null && curr.value == curr.next.value) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }

        }
    }

    public SingleLinkedList copyListRerversed() {
        Node tempNode = null;
        Node tempNdoe2 = null;
        Node curr = head;
        while (curr != null) {
            tempNdoe2 = new Node(curr.value, tempNode);
            curr = curr.next;
            tempNode = tempNdoe2;
        }
        SingleLinkedList list2 = new SingleLinkedList();
        list2.head = tempNode;
        return list2;
    }

    public SingleLinkedList copyList() {
        Node headNode = null;
        Node tailNode = null;
        Node tempNode = null;
        Node currNode = head;
        if (currNode == null) {
            return null;
        }
        headNode = new Node(currNode.value, null);
        tailNode = headNode;
        currNode = currNode.next;

        while (currNode != null) {
            tempNode = new Node(currNode.value, null);
            tailNode.next = tempNode;
            tailNode = tempNode;
            currNode = currNode.next;
        }
        SingleLinkedList list2 = new SingleLinkedList();
        list2.head = headNode;
        return list2;
    }

    private boolean compareList(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return true;
        } else if (head1 == null || head2 == null || head1.value != head2.value) {
            return false;
        } else {
            return compareList(head1.next, head2.next);
        }
    }

    public boolean compareListRec(SingleLinkedList newList) {
        return compareList(head, newList.head);
    }

    public boolean compareList2(SingleLinkedList newList) {
        Node head1 = head;
        Node head2 = newList.head;
        while (head1 == null && head2 == null) {
            if (head1.value != head2.value) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if (head1 == null && head2 == null) {
            return true;
        }
        return false;
    }

    public int nthNodeFromBegining(int index) {
        if (index > size || index < 1) {
            return Integer.MAX_VALUE;
        }
        int count = 0;
        Node curr = head;
        while (curr != null && count < index - 1) {
            count++;
            curr = curr.next;
        }
        return curr.value;
    }

    public int nthNodeFromEnd(int index) {
        int startIndex;
        if (size != 0 && size < index) {
            return Integer.MAX_VALUE;
        }
        startIndex = size - index + 1;
        return nthNodeFromBegining(startIndex);
    }

    public int nthNodeFromEnd2(int index) {
        int count = 1;
        Node forwarNode = head;
        Node curr = head;
        while (forwarNode != null && count <= index) {
            count++;
            forwarNode = forwarNode.next;
        }
        if (forwarNode == null) {
            return Integer.MAX_VALUE;
        }
        while (forwarNode != null) {
            forwarNode = forwarNode.next;
            curr = curr.next;
        }
        return curr.value;
    }

    public void sampleElements() {
        SingleLinkedList list = new SingleLinkedList();
        // Elements are added at the head of the list........
        list.addHead(2);
        list.addHead(3);
        list.addHead(7);
        list.addHead(2);
        list.addHead(3);
        list.addHead(13);
        list.addHead(17);
        list.addHead(21);
        list.addHead(3);
        list.addHead(33);
        list.addHead(72);
        list.PrintList();
        System.out.println("List Size: " + list.size);

    }

    public void sortedInsertedElements() {
        SingleLinkedList list = new SingleLinkedList();
        // elements are inserted in assending order...
        list.sortedInsert(4);
        list.sortedInsert(6);
        list.sortedInsert(10);
        list.sortedInsert(2);
        list.sortedInsert(14);
        list.sortedInsert(61);
        list.sortedInsert(20);
        list.sortedInsert(2);
        list.sortedInsert(14);
        list.sortedInsert(23);
        list.sortedInsert(42);
        list.sortedInsert(16);
        list.sortedInsert(2);
        list.sortedInsert(14);
        list.sortedInsert(15);
        list.sortedInsert(26);
        list.PrintList();

        System.out.println("List Size: " + list.size);
    }

    public static void main(String[] args) {
        // Random r = new Random();
        SingleLinkedList list = new SingleLinkedList();
        // {
        // // Elements are added at the head of the list........
        // list.addHead(2);
        // list.addHead(3);
        // list.addHead(7);
        // list.addHead(2);
        // list.addHead(13);
        // list.addHead(3);
        // list.addHead(3);
        // list.addHead(2);
        // list.addHead(17);
        // list.addHead(21);
        // list.addHead(3);
        // list.addHead(33);
        // list.addHead(72);
        // list.addHead(13);
        // list.PrintList();
        // System.out.println("List Size: " + list.size);
        // System.out.println();

        // }

        {
            list.sortedInsert(4);
            list.sortedInsert(6);
            list.sortedInsert(10);
            list.sortedInsert(2);
            list.sortedInsert(14);
            list.sortedInsert(61);
            list.sortedInsert(20);
            list.sortedInsert(2);
            list.sortedInsert(14);
            list.sortedInsert(23);
            list.sortedInsert(42);
            list.sortedInsert(16);
            list.sortedInsert(2);
            list.sortedInsert(14);
            list.sortedInsert(15);
            list.sortedInsert(26);
            list.PrintList();
        }
        {
            // System.out.println("Removed Head is " + list.removeHead());
            // System.out.println("Deleted: "+ list.deleteNode(7));
            // list.deleteNodes(3);
            // list.reverseList();
            // list.reverseRecurse();
            // list.reverseRecurse2();
            list.removeDuplicate();
            list.PrintList();

        }

    }

}
