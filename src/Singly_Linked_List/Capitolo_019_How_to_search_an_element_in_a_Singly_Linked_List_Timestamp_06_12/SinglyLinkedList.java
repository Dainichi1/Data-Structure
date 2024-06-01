 package Singly_Linked_List.Capitolo_019_How_to_search_an_element_in_a_Singly_Linked_List_Timestamp_06_12;

 import java.util.List;

 public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // può essere un generic type
        private ListNode next; // reference to next ListNode in a list

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
        System.out.println("null");
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

    // ELEMENTO TROVATO O NON TROVATO
    public boolean find(int searchKey) {
        if (head == null) {
            return false;
        }

        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;


        singlyLinkedList.display();
        int searchKey = 11312;
        if (singlyLinkedList.find(searchKey)) {
            System.out.println("Elemento: "+searchKey+" trovato");
        } else {
            System.out.println("Elemento: "+searchKey+" non trovato ");
        }
    }

}
