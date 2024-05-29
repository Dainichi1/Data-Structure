package Capitolo_009_Is_String_Palindrome_Timestamp_03_34;

public class Palindrome {

    public boolean isPalindrome (String word ) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                System.out.println(word.toUpperCase() + " is not a palindrome word");
                return false;
            }
            start++;
            end --;
        }
        System.out.println(word.toUpperCase() + " is a palindrome word");
        return true;
    }
    public static void main(String[] args) {
        Palindrome example = new Palindrome();
        example.isPalindrome("anna");

    }
}
