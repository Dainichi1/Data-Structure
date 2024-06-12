package List._01_Singly_Linked_List.Capitolo_026_How_to_find_start_of_loop_in_a_Singly_Linked_List_Timestamp_07_37;

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

    // CONTROLLO SE C'E' UN LOOP NELLA LISTA
    public boolean containsLoop () {

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    // CONTROLLO SE C'E' UN LOOP NELLA LISTA E RESTITUISCO IL NODO DA CUI NASCE IL LOOP
    public ListNode startNodeInALoop () {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (slowPointer == fastPointer) {
                return getStartingNode(slowPointer);
            }
        }
        return null;
    }

    // METODO PER OTTENERE IL NODO DI INIZIO LOOP
    private ListNode getStartingNode(ListNode slowPointer) {
        ListNode temp = head;
        while (temp != slowPointer) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        return temp; // starting node of a loop
    }

    // CREO UNA LISTA CON UN LOOP
    public void createALoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.createALoopInLinkedList();
        System.out.println(sll.containsLoop());

        System.out.println(sll.startNodeInALoop().data);
    }

}
