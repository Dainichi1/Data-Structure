package List.Singly_Linked_List.Capitolo_024_How_to_remove_a_given_key_from_Singly_Linked_List_Timestamp_07_09;

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

    // ELIMINO UN NODO A MIA SCELTA
    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key) {
            head = current.next;
        }

        while (current!=null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        temp.next = current.next;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertFirst(16);
        sll.insertFirst(10);
        sll.insertFirst(8);
        sll.insertFirst(1);

        sll.display();
        sll.deleteNode(16);
        sll.display();


    }


}
