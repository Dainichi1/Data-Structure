package _03_Stack.Capitolo_42_Implement_Stack_with_an_Array_Timestamp_12_34;

import java.util.EmptyStackException;

public class Stack {

    private int top;
    private int[] arr;

    public Stack (int capacity) {
        top = -1;
        arr = new int[capacity];
    }

    public Stack() {
        this(10);
    }

    // PUSH
    public void push (int data) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        top ++;
        arr[top] = data;
    }

    // POP
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public boolean isFull() {
        return arr.length == size();
    }

    // PEEK
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int size (){
        return top + 1;
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
