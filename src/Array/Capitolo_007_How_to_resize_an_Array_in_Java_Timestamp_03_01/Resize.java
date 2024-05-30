package Array.Capitolo_007_How_to_resize_an_Array_in_Java_Timestamp_03_01;

public class Resize {

    public void printArray (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] resize (int[] arr, int capacity) {
        int[] temp = new int [capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Resize arrUtil = new Resize();
//        arrUtil.printArray(new int[] {5,1,2,9,10});
        int[] original = new int[] {5,1,2,9,10};
        System.out.println("The size of original array is: "+original.length);
        original = arrUtil.resize(original,10);
        System.out.println("The size of the original array after resize is: "+original.length);


    }
}
