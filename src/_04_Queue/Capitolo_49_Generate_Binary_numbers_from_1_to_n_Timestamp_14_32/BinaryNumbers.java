package _04_Queue.Capitolo_49_Generate_Binary_numbers_from_1_to_n_Timestamp_14_32;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {

    public static String[] generateBinaryNumbers(int n) {
        String[] result = new String [n];
        Queue<String> q = new LinkedList<>();

        q.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateBinaryNumbers(4)));
    }
}
