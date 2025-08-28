package Conditionals;
import java.util.Scanner;


public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n;
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number you entered is even ");
        }
//        if (n%2!=0){
//            System.out.println("The number you entered is odd ");
        else {
            System.out.println("The number you entered is odd ");

        }
    }
}
