package List._01_Singly_Linked_List.Capitolo_029_Add_Two_Singly_Linked_List_Timestamp_09_21;

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

    // AGGIUNGO UN ELEMENTO ALLA FINE DELLA LISTA
    public void insertLast(int value) {
        ListNode newNode= new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next ) {
            current = current.next;
        }
        current.next = newNode;
    }

    // SOMMO 2 LISTE
    // a --> 7 --> 4 --> 9 --> null
    // b 5 --> 6 --> null
    // 947 + 65
    public static ListNode add (ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int resto = 0;

        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = resto + x + y;

            resto = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        if (resto > 0) {
            tail.next = new ListNode(resto);
        }
        return dummy;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.insertLast(7);
        sll1.insertLast(4);
        sll1.insertLast(9);

        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertLast(5);
        sll2.insertLast(6);


        sll1.display();
        sll2.display();

        SinglyLinkedList result = new SinglyLinkedList();
        result.head =  add(sll1.head, sll2.head);
        result.display();



    }

}
