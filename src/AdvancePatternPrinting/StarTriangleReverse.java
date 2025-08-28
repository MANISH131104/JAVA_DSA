package AdvancePatternPrinting;
import java.util.Scanner;

public class StarTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n;
        n = sc.nextInt();
//        for(int i=1 ;i<=n ;i++) {
//            for(int j=1 ;j<=n ;j++) {
//                if (i+j<=n) System.out.print(" "+" ");
//                else System.out.print("*"+" ");
//            }
//            System.out.println();
//
//        }

        // METHOD -2
        for(int i=1 ;i<=n ;i++) {  // lines
            for(int j=1 ;j<=n-i ;j++) {  // spaces
                System.out.print(" "+" ");
            }
            for(int j=1 ;j<=i ;j++) {   // stars
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
