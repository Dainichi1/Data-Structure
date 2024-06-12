package List._01_Singly_Linked_List.Capitolo_028_Merge_Two_Sorted_Singly_Linked_List_Timestamp_08_37;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode  {
        private int data;
        private ListNode next;
        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    // STAMPO LA LISTA
    public void display () {
        ListNode current = head;
        while (current != null) {
            System.out.print(current+" ----> ");
            current = current.next;
        }
        System.out.println(""+null);
    }

    // AGGIUNGO UN ELEMENTO ALLA FINE DELLA LISTA
    public void insertLast(int value) {
        ListNode newNode= new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next ) {
            current = current.next;
        }
        current.next = newNode;
    }

    // UNISCO DUE LISTE
    public static ListNode merge (ListNode a, ListNode b) {
        // a --> 1 --> 3 --> 5 --> null
        // b --> 2 --> 4 --> 6 --> null
        // result --> 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // a --> 1 --> 3 --> null
        // b --> 2 --> 4 --> 6 --> 7 --> 9 --> 10 --> null
        // result --> 1 --> 2 --> 3 --> 4 --> 6 --> 7 --> 9 --> 10 --> null
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);

        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertLast(3);
        sll2.insertLast(5);
        sll2.insertLast(8);
        sll2.insertLast(9);
        sll2.insertLast(14);
        sll2.insertLast(18);

        sll1.display();
        sll2.display();

        SinglyLinkedList result = new SinglyLinkedList();
        result.head =  merge(sll1.head, sll2.head);
        result.display();



    }

}
