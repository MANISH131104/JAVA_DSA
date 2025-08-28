package TwoDArray.java;
import java.util.Scanner;

public class matrixMultiplication {
    public static void print(int[][] arr){
        for(int i=0 ;i<arr.length ;i++){
            for(int j=0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROWS OF MATRIX 1  : ");
        int r1 = sc.nextInt();
        System.out.print("ENTER COLS OF MATRIX OF 1 : ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.print("ENTER ELEMENTS OF MATRIX 1 : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("ENTER ROWS OF MATRIX 2: ");
        int r2 = sc.nextInt();
        System.out.print("ENTER COLS OF MATRIX 2 : ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.print("ENTER ELEMENTS OF MATRIX 2 : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("INVALID DATA : ");
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] = a[i][k] + b[k][j];
                }
            }
            print(mul);

        }
    }
}
