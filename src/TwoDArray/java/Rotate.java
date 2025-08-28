package TwoDArray.java;
import java.util.Scanner;

public class Rotate {
    public static void print(int[] arr){
        for(int i=0 ;i<arr.length ;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void reverse(int[] ans){
        int n=ans.length;
        int i=0 ;
        int j=n-1;
        while(i<j) {
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++ ;
            j-- ;
        }
        print(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROWS OF MATRIX   : ");
        int r = sc.nextInt();
        System.out.print("ENTER COLS OF MATRIX OF  : ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.print("ENTER ELEMENTS OF MATRIX  : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = a[j][i];
            }
        }
        int n =a.length;
        for(int i=0 ;i<n ;i++){
            reverse(ans[i]);

        }
    }
}
