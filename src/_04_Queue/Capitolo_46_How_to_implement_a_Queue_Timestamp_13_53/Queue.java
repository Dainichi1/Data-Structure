package _04_Queue.Capitolo_46_How_to_implement_a_Queue_Timestamp_13_53;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }


    public static void main(String[] args) {

    }
}
