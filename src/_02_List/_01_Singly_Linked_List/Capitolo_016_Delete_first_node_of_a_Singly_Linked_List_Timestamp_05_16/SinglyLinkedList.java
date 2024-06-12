 package _02_List._01_Singly_Linked_List.Capitolo_016_Delete_first_node_of_a_Singly_Linked_List_Timestamp_05_16;

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

    // CANCELLO IL PRIMO NODO
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = temp.next;
        temp.next = null;
        return temp;
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

        sl.display(); // lista originale
        System.out.println("Length is : "+sl.length()+"\n");

        System.out.println("Il nodo da eliminare in prima posizione è: "+sl.deleteFirst().data);
        sl.display(); // lista con il primo nodo cancellato
        System.out.println("Length is : "+sl.length()+"\n");
    }

}
