 package Singly_Linked_List.Capitolo_015_Insert_a_node_in_a_Singly_Linked_List_at_a_given_position_Timestamp_04_47;

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

    // NUMERO DEGLI ELEMENTI DELLA LISTA
    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return  count;
    }

    // AGGIUNGO UN NODO IN UNA POSIZIONE A MIA SCELTA
    public void insert(int position, int value) {
        int length = length();
        if (position == 0 || position > length + 1  ) {
            throw new IllegalArgumentException("Valore non valido");
        }
        ListNode node = new ListNode(value);
        if (position == 1) {
           node.next = head;
           head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while ( count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }

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

        sl.insert(3,123);

        sl.display();
        System.out.println("\nLength is : "+sl.length());
    }

}
