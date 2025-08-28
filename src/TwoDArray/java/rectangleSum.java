package TwoDArray.java;
import java.util.Scanner;

public class rectangleSum {
    public static int sum(int[][] a , int l1,int r1,int l2,int r2){
        int sum=0 ;
        for(int i=l1 ;i<=l2 ;i++){
            for(int j=r1 ;j<=r2 ;j++){
                sum = sum+a[i][j];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROW AND COLS OF MATRIX : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.print("ENTER ELEMENT OF MATRIX : ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                a[i][j]  = sc.nextInt();
            }
        }
        System.out.println("ENTER RECTANGLE BOUNDARIES L1,R1,L2,R2 : ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("RECTANGLE SUM : "+sum(a,l1,r1,l2,r2));
    }
}
