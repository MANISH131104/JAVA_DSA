package Loops;
import java.util.Scanner;

public class printingINRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A : ");
        int a;
        a = sc.nextInt();
        System.out.print("ENTER B : ");
        int b;
        b = sc.nextInt();
        for (int i = a ; i<=b ; i++) {
            System.out.println(i);
        }
    }
}
