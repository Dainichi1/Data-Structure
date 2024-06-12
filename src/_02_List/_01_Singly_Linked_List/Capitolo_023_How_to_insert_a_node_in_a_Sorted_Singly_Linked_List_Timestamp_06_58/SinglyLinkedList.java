package _02_List._01_Singly_Linked_List.Capitolo_023_How_to_insert_a_node_in_a_Sorted_Singly_Linked_List_Timestamp_06_58;

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

    // AGGIUNGO UN ELEMENTO ALL'INIZIO DELLA LISTA
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    // INSERISCO UN NUOVO NODO
    public ListNode insertInSortedList (int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertFirst(16);
        sll.insertFirst(10);
        sll.insertFirst(8);
        sll.insertFirst(1);

        sll.display();
        sll.insertInSortedList(11);
        sll.display();

    }


}
