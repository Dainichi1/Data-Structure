package _02_List._01_Singly_Linked_List.Capitolo_014_How_to_insert_node_at_the_end_of_a_Singly_Linked_List_Timestamp_04_32;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    // STAMPO GLIELEMENTI DELLA LISTA
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // AGGIUNGO UN ELEMENTO ALLA FINE DELLA LISTA
    public void insertLast(int value) {
        ListNode newNode= new ListNode(value);
        if (head == null) {
            head = newNode;
        }
        ListNode current = head;
        while (null != current.next ) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Le collego insieme per formare una catena
        sl.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null


        sl.insertLast(10000);
        sl.display();
    }

}
