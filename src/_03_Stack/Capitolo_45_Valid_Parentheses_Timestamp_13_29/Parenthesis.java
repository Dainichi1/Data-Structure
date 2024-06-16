package _03_Stack.Capitolo_45_Valid_Parentheses_Timestamp_13_29;

import java.util.Stack;

public class Parenthesis {

    public static boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (c == ')' && top == '(' ||
                        c == '}' && top == '{' ||
                        c == ']' && top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(s);
        System.out.println(isValid(s));
    }
}
