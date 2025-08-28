package Loops;
import java.util.Scanner;

public class tableOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER  : ");
        int n = sc.nextInt();
        for (int i = n; i <= 10 * (n); i = i + n) {
            System.out.println(i);
        }


//        for ( int i = 1; i<= 10 * (n) ; i++) {
//            if (i%n == 0) System.out.println(i);
//        }
    }
}
