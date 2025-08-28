package Loops;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n = sc.nextInt();
        boolean flag = false;  // false means prime
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {  // i is factor of n
                flag = true ; // true means composite
                break;

            }
        }
        if(n == 1) System.out.println("NEITHER PRIME NOR COMPOSITE ");
        else if ( flag == false) {
            System.out.println("PRIME NUMBER ");
        }
        else {
            System.out.println("COMPOSITE NUMBER ");
        }
    }
}
