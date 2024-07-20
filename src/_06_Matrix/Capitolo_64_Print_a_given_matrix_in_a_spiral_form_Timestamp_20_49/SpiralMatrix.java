package _06_Matrix.Capitolo_64_Print_a_given_matrix_in_a_spiral_form_Timestamp_20_49;


public class SpiralMatrix {

    public void spiralPrint(int[][] matrix, int r,int c) {
        int i, k = 0, l = 0;
        while (k < r && l < c) {
          for (i = l;i < c;i++){
              System.out.println(matrix[k][i]+"");
          }
          k++;
          for (i = k;i < r;i++){
              System.out.println(matrix[i][c-1]+"");
          }
          c--;
          if(k < r) {
              for (i = c-1;i >= l;i--){
                  System.out.println(matrix[r-1][i]+"");
              }
              r--;
          }
          if(l < c) {
              for (i = r-1;i >= k;i--){
                  System.out.println(matrix[i][l]+"");
              }
              l++;
          }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        SpiralMatrix sm = new SpiralMatrix();
        sm.spiralPrint(matrix, matrix.length, matrix.length);
    }
}
