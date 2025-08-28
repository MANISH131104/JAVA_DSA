package patternPrinting;
import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NO. OF ROWS : ");
        int m = sc.nextInt();
        System.out.print("ENTER NO. OF COLS : ");
        int n = sc.nextInt();
        for ( int i=1 ; i<=m ; i++) {    // rows
            for ( int j = 1 ; j<=n ; j++) {    // cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
