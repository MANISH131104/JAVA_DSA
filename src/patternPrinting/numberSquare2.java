package patternPrinting;
import java.util.Scanner;

public class numberSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int m = sc.nextInt();
        for ( int i=1 ; i<=m ;i++) {  // rows
            for ( int j=1 ; j<=m ;j++) {  // cols
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}



