package List._02_Doubly_Linked_List.Capitolo_30_How_to_implement_Doubly_Linked_List_Timestamp_09_46;

public class DoublyLinkedList {

    private ListNode head; // puntatore alla testa
    private ListNode tail; // puntatore alla coda
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

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
}
