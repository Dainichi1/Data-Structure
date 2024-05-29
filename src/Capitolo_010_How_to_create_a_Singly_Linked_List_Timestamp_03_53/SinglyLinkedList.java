package Capitolo_010_How_to_create_a_Singly_Linked_List_Timestamp_03_53;

import java.util.List;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Le collego insieme per formare una catena
        sll.head.next = second; // 10 --> 1 
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11

    }

}
