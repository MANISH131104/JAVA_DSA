package Methods;
import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int fact = 1;
        for(int i=1 ;i<=n ;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n;
        n = sc.nextInt();
        int fact = fact(n);
        System.out.println(fact);
    }
}
