package _01_Array.Capitolo_004_Find_Minimum_Value_in_Array_Timestamp_2_16;

public class MinArray {

    public int findMinimum (int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input invalid");
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,8,9,1,44};
        MinArray ma = new MinArray();
        System.out.println(ma.findMinimum(arr));

    }
}
