package _03_Stack.Capitolo_41_How_to_implement_a_Stack_Timestamp_12_14;

import java.util.EmptyStackException;

public class Stack {

    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
        }
    }

    public Stack () {
        top = null;
        length = 0;
    }

    public int length () {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    // PUSH
    public void push (int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    // POP
    public int pop () {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    // PEEK - FA VEDERE L?ULTIMO NODO ISNERITO
    public int peek() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }
        return top.data;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());




    }
}
