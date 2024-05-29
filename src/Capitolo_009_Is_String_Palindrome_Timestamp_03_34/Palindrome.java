package Capitolo_009_Is_String_Palindrome_Timestamp_03_34;

public class Palindrome {

    public void isPalindrome (String word ) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                System.out.println(word.toUpperCase() + " is not a palindrome word");
                return;
            }
            start++;
            end --;
        }
        System.out.println(word.toUpperCase() + " is a palindrome word");
    }
    public static void main(String[] args) {
        Palindrome example = new Palindrome();
        example.isPalindrome("anna");

    }
}
