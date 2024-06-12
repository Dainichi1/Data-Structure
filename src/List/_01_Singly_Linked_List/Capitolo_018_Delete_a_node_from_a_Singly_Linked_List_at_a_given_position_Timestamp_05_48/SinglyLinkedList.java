 package List._01_Singly_Linked_List.Capitolo_018_Delete_a_node_from_a_Singly_Linked_List_at_a_given_position_Timestamp_05_48;

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

    // CANCELLO UN NODO A SCELTA
    public void delete (int position) {
        int length = length();
        if (position == 0 || position > length + 1  ) {
            throw new IllegalArgumentException("Valore non valido");
        }
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
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

        sl.display(); // lista originale
        System.out.println("Length is : "+sl.length()+"\n");

        sl.delete(4);
        sl.display();

//        System.out.println("Il nodo da cancellare in ultima posizione è: "+sl.deleteLast().data);
//        sl.display();
//        System.out.println("La lista è lunga: "+sl.length()+"\n");


//        System.out.println("Il nodo da eliminare in prima posizione è: "+sl.deleteFirst().data);
//        sl.display(); // lista con il primo nodo cancellato
//        System.out.println("Length is : "+sl.length()+"\n");
    }

}
