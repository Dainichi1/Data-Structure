package List.Singly_Linked_List.Capitolo_022_How_to_remove_duplicates_from_a_Sorted_Singly_Linked_List_Timestamp_06_46;

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

    // ELIMINO I NODI DUPLICATI NELLA LISTA
    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(3);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);
        ListNode fifth = new ListNode(1);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        sll.display(sll.head);
        sll.removeDuplicates();
        sll.display(sll.head);

    }


}
