package _02_List._03_Circular_Singly_Linked_List.Capitolo_40_How_to_remove_first_node_from_a_Circular_Singly_Linked_List_Timestamp_11_52;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    // CREO LA LISTA
    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    // STAMPO LA LISTA
    public void display() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data+ " --> ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    // AGGIUNGO UN NODO ALLA FINE DELLA LISTA
    public void insertLast (int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    // ELIMINO IL PRIMO NODO DELLA LISTA
    public ListNode removeFirst () {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = last.next;
            if (last.next == last) {
                last = null;
            } else {
                last.next = temp.next;
            }
            temp.next = null;
            length--;
            return temp;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertLast(10);
        csll.insertLast(15);
        csll.insertLast(25);
        csll.display();
        System.out.println("\n"+csll.length);

        csll.removeFirst();
        csll.display();

    }
}
