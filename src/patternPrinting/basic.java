package patternPrinting;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ROWS : ");
        int m = sc.nextInt();
        for ( int i = 1 ; i<=m ; i++) {
            System.out.println("*****");
        }
    }
}
