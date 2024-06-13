package _02_List._02_Doubly_Linked_List.Capitolo_32_How_to_insert_node_at_the_beginning_of_a_Doubly_Linked_List_Timestamp_10_05;

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

    // STAMPO LA LISTA DALLA FINE ALL?INIZIO
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

    // INSERISCO UN NODO ALL'INIZIO DELLA LISTA
    public void insertFirst (int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertFirst(15);
        dll.insertFirst(25);

        dll.displayForward();
        dll.displayBackward();
    }

}
