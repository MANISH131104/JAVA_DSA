package AdvancePatternPrinting;
import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
