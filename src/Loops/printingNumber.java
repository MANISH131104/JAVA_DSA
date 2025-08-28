package Loops;
import java.util.Scanner;

public class printingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n;
        n = sc.nextInt();
        for (int i=1 ; i<=n; i++) {
            System.out.println(i);
        }

    }
}
