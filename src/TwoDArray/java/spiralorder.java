package TwoDArray.java;
import java.util.Scanner;

public class spiralorder {
    public static void print(int[][] ans){
        for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j <ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCols = 0, rightCols = n - 1;
        int curr = 1;

        while (curr <= (n * n)) {
            // topRow -> leftCols to rightCols
            for (int j = leftCols; j <= rightCols && curr <= n*n; j++) {
                matrix[topRow][j] = curr;
                curr++ ;
            }
            topRow++;

            // rightCols -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr <= n*n ; i++) {
               matrix[i][rightCols] = curr;
               curr++ ;
            }
            rightCols--;

            // bottomRow -> rightCols to leftCols
            for (int j = rightCols; j >= leftCols && curr <= n*n; j--) {
               matrix[bottomRow][j] = curr;
               curr++;

            }
            bottomRow--;

            // leftCols -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr <= n*n; i--) {
               matrix[i][leftCols] = curr;
               curr++ ;
            }
            leftCols++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n = sc.nextInt();
        int[][] matrix = generateSpiralMatrix(n);
        print(matrix);
    }
}
