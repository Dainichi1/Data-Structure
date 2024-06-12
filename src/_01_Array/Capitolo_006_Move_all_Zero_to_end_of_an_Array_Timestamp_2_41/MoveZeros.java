package _01_Array.Capitolo_006_Move_all_Zero_to_end_of_an_Array_Timestamp_2_41;

public class MoveZeros {

    public void printArray (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrayDEmo() {
        int[] arr = {8,1,0,2,1,0,3};
        printArray(arr);
        moveZeros(arr,arr.length);
        printArray(arr);
    }

    public void moveZeros(int[] arr, int n) { // int n: 'n' rappresenta la lunghezza dell'array
        int j = 0; // si concentra sugli 0 presenti nell'array
        for (int i = 0; i < n; i++) { //si concentra sugli elementi dell'array che non sono 0
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros arrUtil = new MoveZeros();
        arrUtil.arrayDEmo();

    }
}
