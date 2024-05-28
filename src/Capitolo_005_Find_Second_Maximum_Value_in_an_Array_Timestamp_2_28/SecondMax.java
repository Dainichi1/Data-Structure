package Capitolo_005_Find_Second_Maximum_Value_in_an_Array_Timestamp_2_28;


public class SecondMax {

    public int findSecondMax (int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,8,9,1,44};
         SecondMax sm = new SecondMax();
        System.out.println(sm.findSecondMax(arr));

    }
}
