package Loops;
import java.util.Scanner;

public class helloWorldNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n;
        n = sc.nextInt();
//        for ( int i = 1; i<=n; i++) {
//            System.out.println("HELLO WORLD");
//        }
        int i;
        for (i=1; i<=n; i++) {
            System.out.println("HELLO WORLD ");
        }
        System.out.println(i);
    }
}
