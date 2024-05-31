 package Singly_Linked_List.Capitolo_018_Delete_a_node_from_a_Singly_Linked_List_at_a_given_position_Timestamp_05_48;

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

    // AGGIUNGO UN ELEMENTO ALL'INIZIO DELLA LISTA
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    // AGGIUNGO UN NODO IN UNA POSIZIONE A MIA SCELTA
    public void insert(int position, int value) {
        int length = length();
        if (position == 0 || position > length + 1  ) {
            throw new IllegalArgumentException("Valore non valido");
        }
        ListNode node = new ListNode(value);
        if (position == 1) {
           node.next = head;
           head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while ( count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }

    }

    // AGGIUNGO UN ELEMENTO ALLA FINE DELLA LISTA
    public void insertLast(int value) {
        ListNode newNode= new ListNode(value);
        if (head == null) {
            head = newNode;
        }
        ListNode current = head;
        while (null != current.next ) {
            current = current.next;
        }
        current.next = newNode;
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

        sl.insertFirst(11);
        sl.insertFirst(8);

        sl.insertLast(4564);
        sl.insertLast(10000);

        sl.insert(3,123);

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
