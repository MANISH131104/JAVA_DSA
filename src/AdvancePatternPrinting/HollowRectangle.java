package AdvancePatternPrinting;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROWS : ");
        int m;
        m = sc.nextInt();
        System.out.print("ENTER COLS : ");
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 2 || i == 3) & (j == 2 || j == 3 || j == 4 || j == 5)) {
                    System.out.print(" "+" ");
                }
                else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}
