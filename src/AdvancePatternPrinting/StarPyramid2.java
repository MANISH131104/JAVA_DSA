package AdvancePatternPrinting;
import java.util.Scanner;

public class StarPyramid2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ENTER N : ");
            int n;
            n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" " + " ");
//            }
//            for (int j = 1; j <= (2 * i) - 1; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }



            int nsp = n-1;
            int nst = 1;
            for (int i = 1; i <= n; i++) {  // lines
                for (int j = 1; j <= nsp; j++) {    // spaces
                    System.out.print(" " + " ");
                }
                for (int j = 1; j <= nst; j++) {  // stars
                    System.out.print("*" + " ");
                }
                nsp--;
                nst+=2;
                System.out.println();
            }



        }
    }
