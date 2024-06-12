package _01_Array.Capitolo_001_One_Dimensional_Array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        new ArrayDemo().arrayDemo(); // Crea un'istanza di Main e chiama arrayDemo
    }

    public void arrayDemo() {
        int[] myArray = new int[5]; // Dimensione dell'array è 5, quindi gli indici validi sono da 0 a 4
        myArray[0] = 5;
        System.out.println(Arrays.toString(myArray));

        myArray[1] = 1;
        System.out.println(Arrays.toString(myArray));

        myArray[2] = 8;
        System.out.println(Arrays.toString(myArray));

        myArray[3] = 2;
        System.out.println(Arrays.toString(myArray));

        myArray[4] = 10;
        System.out.println(Arrays.toString(myArray));

        // La linea successiva è stata rimossa perché l'indice 5 è fuori dai limiti per un array di dimensione 5
        // myArray[5] = 7;
    }
}
