package Conditionals;
import java.util.Scanner;

public class nestedDivisibleBy5or3Not15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n;
        n = sc.nextInt();
//        if( n%5==0 || n%3==0) {
//            if (n % 15 != 0) {
//                System.out.println("The number is divisible by 5 or 3 not 15 ");
//            }
//            else {
//                System.out.println("The number is not divisible ");
//            }
//        }
//        else {
//            System.out.println("The number is not divisible ");
//        }
        if ( (n%5 == 0 || n%3 == 0) && n%15 != 0) {
            System.out.println("The number is divisible is 5 or 3 but not 15 ");
        }
        else {
            System.out.println("Not divisible ");
        }

    }
}
