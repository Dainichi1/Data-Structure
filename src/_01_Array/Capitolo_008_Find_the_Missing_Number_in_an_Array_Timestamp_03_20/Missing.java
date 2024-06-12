package _01_Array.Capitolo_008_Find_the_Missing_Number_in_an_Array_Timestamp_03_20;

public class Missing {

    public static int findMissingNumber (int[] arr) {

        int n = arr.length + 1;
        int sum = n*(n+1) / 2;
        for (int number : arr ) {
            sum = sum - number;
        }
        return sum;
    }

    public void arrayDemo() {
        int[] arr = {1,3,6,8,2,4,7};
        System.out.println(findMissingNumber(arr));
    }

    public static void main(String[] args) {
        Missing arrayUtil = new Missing();
        arrayUtil.arrayDemo();
    }
}
