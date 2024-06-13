package _02_List._02_Doubly_Linked_List.Capitolo_35_How_to_delete_last_node_in_a_Doubly_Linked_List_Timestamp_10_41;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head; // puntatore alla testa
    private ListNode tail; // puntatore alla coda
    private int length;

    private class ListNode {
        private int data;
        private ListNode next; // puntatore al prossimo nodo
        private ListNode previous; // puntatore al nodo precedente

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty () {
        return length == 0;
    }

    public int length() {
        return length;
    }

    // STAMPO LA LISTA DALL'INIZIO ALLA FINE
    public void displayForward() {
        if (head == null) {
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // STAMPO LA LISTA DALLA FINE ALL'INIZIO
    public void displayBackward() {
        if (tail == null) {
            return;
        }

        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data+ " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    // INSERISCO UN NODO ALLA FINE
    public void insertLast (int value) {
        ListNode newNode = new ListNode(value);
        if(isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    // CANCELLO IL NODO finale
    public ListNode deleteLast () {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);

        dll.displayForward();
        dll.displayBackward();
        System.out.println("La lunghezze della lista è: "+dll.length+"\n");

        dll.deleteLast();
        dll.displayForward();
        dll.displayBackward();
        System.out.println("La lunghezze della lista è: "+dll.length);

    }

}
