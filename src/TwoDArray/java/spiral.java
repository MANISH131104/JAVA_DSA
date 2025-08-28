package TwoDArray.java;
import java.util.Scanner;

public class spiral {
    public static void printMatrix(int[][] ans){
        for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j <ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printSpiralOrder(int[][] matrix , int r,int c) {
        int topRow = 0, bottomRow = r - 1, leftCols = 0, rightCols = c - 1;
        int totalElements = 0;

        while (totalElements < (r * c)) {
            // topRow -> leftCols to rightCols
            for (int j = leftCols; j <= rightCols && totalElements < r*c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCols -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r*c; i++) {
                System.out.print(matrix[i][rightCols] + " ");
                totalElements++;
            }
            rightCols--;

            // bottomRow -> rightCols to leftCols
            for (int j = rightCols; j >= leftCols && totalElements < r*c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftCols -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r*c; i--) {
                System.out.print(matrix[i][leftCols] + " ");
                totalElements++;
            }
            leftCols++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROWS OF MATRIX   : ");
        int r = sc.nextInt();
        System.out.print("ENTER COLS OF MATRIX   : ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.print("ENTER ELEMENTS OF MATRIX  : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("INPUT MATRIX : ");
        printMatrix(a);
        System.out.println("SPIRAL MATRIX : ");
        printSpiralOrder(a,r,c);


    }
}
