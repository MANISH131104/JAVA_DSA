package Loops;
import java.util.Scanner;

public class productOfNonZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int n = sc.nextInt();
        int product = 1;

        while ( n!= 0){
            int last_digit = n%10;
            if(last_digit != 0) {
                product = product * last_digit;
            }
            n = n/10;
        }
        System.out.println(product);
    }
}
