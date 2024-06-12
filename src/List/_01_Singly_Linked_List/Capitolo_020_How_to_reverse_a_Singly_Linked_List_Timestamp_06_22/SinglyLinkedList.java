package List._01_Singly_Linked_List.Capitolo_020_How_to_reverse_a_Singly_Linked_List_Timestamp_06_22;

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
    public void display (ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current+" ----> ");
            current = current.next;
        }
        System.out.println(""+null);
    }

    // INVERSIONE DELLA LISTA
    public ListNode reverse (ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while( current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(23);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;



        sll.display(sll.head);
        ListNode reversedListHead = sll.reverse(sll.head);
        sll.display(reversedListHead);
    }


}
