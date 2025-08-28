package TwoDArray.java;
import java.util.Scanner;

public class Transpose {
    public static void print(int[][] ans){
        for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j <ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROWS OF MATRIX   : ");
        int r = sc.nextInt();
        System.out.print("ENTER COLS OF MATRIX OF  : ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.print("ENTER ELEMENTS OF MATRIX  : ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                a[i][j] = sc.nextInt();
            }
        }
//        int[][] ans = new int[c][r];
//        for (int i = 0; i < c; i++) {
//            for (int j = 0; j < r; j++) {
//               ans[i][j] = a[j][i];
//                System.out.print(ans[i][j] +" ");
//            }
//            System.out.println();
//        }



        //without extra array

        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
               int temp = a[i][j];
               a[i][j] = a[j][i];
               a[j][i] = temp;
            }
        }
        print(a);


    }
}
