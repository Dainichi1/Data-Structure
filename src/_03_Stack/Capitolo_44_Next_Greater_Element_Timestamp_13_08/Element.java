package _03_Stack.Capitolo_44_Next_Greater_Element_Timestamp_13_08;


import java.util.Arrays;
import java.util.Stack;

public class Element {

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
            int[] arr = new int[6];
            arr[0] = 4;
            arr[1] = 7;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 8;
            arr[5] = 1;
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(nextGreaterElement(arr)));
        }
    }

