 package List.Singly_Linked_List.Capitolo_017_Delete_last_node_of_a_Singly_Linked_List_Timestamp_05_29;

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

    // CANCELLO L'ULTIMO NODO
    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null; // spezza la catena
        return current;
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

        System.out.println("Il nodo da cancellare in ultima posizione è: "+sl.deleteLast().data);
        sl.display();
        System.out.println("La lista è lunga: "+sl.length()+"\n");
//        System.out.println("Il nodo da eliminare in prima posizione è: "+sl.deleteFirst().data);
//        sl.display(); // lista con il primo nodo cancellato
//        System.out.println("Length is : "+sl.length()+"\n");
    }

}
