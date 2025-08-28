package patternPrinting;
import java.util.Scanner;

public class solidSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NO. OF ROWS : ");
        int m = sc.nextInt();
        for ( int i=1 ; i<=m ; i++) {
            for ( int j = 1 ; j<=m ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

