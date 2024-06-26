package _02_List._02_Doubly_Linked_List.Capitolo_34_How_to_delete_first_node_in_a_Doubly_Linked_List_Timestamp_10_26;

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

    // CANCELLO IL NODO INIZIALE
    public ListNode deleteFirst () {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
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

        dll.deleteFirst();
        dll.displayForward();
        dll.displayBackward();
        System.out.println("La lunghezze della lista è: "+dll.length);

    }

}
