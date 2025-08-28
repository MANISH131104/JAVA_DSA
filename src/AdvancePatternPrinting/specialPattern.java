package AdvancePatternPrinting;
import java.util.Scanner;
public class specialPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n = sc.nextInt();
        int nsp = 0;
        int nst = n;
        for (int i = 1; i <= n; i++) {  // lines
            for (int j = 1; j <= nsp; j++) {    // spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {  // stars
                System.out.print("*" + " ");
            }
            nsp++;
            nst--;
            System.out.println();
        }


    }
}