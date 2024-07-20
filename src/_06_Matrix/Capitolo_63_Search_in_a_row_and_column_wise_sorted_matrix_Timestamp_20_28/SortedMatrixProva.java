package _06_Matrix.Capitolo_63_Search_in_a_row_and_column_wise_sorted_matrix_Timestamp_20_28;

public class SortedMatrixProva {

    public void search (int[][] matrix,int n,int x) {
        int i = 0;
        int j = n-1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                System.out.println("x found at - "+i+", "+j);
                return;
            }
            if (matrix[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Value not found");
    }



    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,51},
        };
        SortedMatrixProva sm = new SortedMatrixProva();
        sm.search(matrix, matrix.length, 45);
    }
}