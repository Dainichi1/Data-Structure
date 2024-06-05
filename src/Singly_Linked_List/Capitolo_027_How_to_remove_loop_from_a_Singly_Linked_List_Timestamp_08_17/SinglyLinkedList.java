package Singly_Linked_List.Capitolo_027_How_to_remove_loop_from_a_Singly_Linked_List_Timestamp_08_17;

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

    // METEODO PER RIMUOVERE IL LOOP
    public void removeLoop () {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (slowPointer == fastPointer) {
                removeLoop(slowPointer);
                return;
            }
        }
    }

    // METODO PER OTTENERE IL NODO DI INIZIO LOOP
    private void removeLoop(ListNode slowPointer) {
        ListNode temp = head;
        while (temp.next != slowPointer.next) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;

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
        System.out.println("La lista contiene un loop: "+sll.containsLoop());

        sll.removeLoop();
        sll.display();

    }

}
