package Singly_Linked_List.Capitolo_021_How_to_find_nth_node_from_the_end__of_a_Singly_Linked_List_Timestamp_06_33;

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

    // TROVO IL NODO "n" INDICATO PARTENDO DALLA FINE DELLA LISTA (ES. IL SECONDO NODO DALLA FINE)
    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: n = "+n);
        }
        ListNode mainPointer = head;
        ListNode referencePointer = head;

        int count = 0;

        while (count < n) {
            if (referencePointer == null) {
                throw new IllegalArgumentException(n+" is greater then the number of nodes in list");
            }
            referencePointer = referencePointer.next;
            count++;
        }
        while (referencePointer != null) {
            referencePointer = referencePointer.next;
            mainPointer = mainPointer.next;
        }
        return mainPointer;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(15);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        sll.display(sll.head);

        ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(2);
        System.out.println("Nth node from end is ---> "+nthNodeFromEnd.data);

    }


}
