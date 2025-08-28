package Conditionals;
import java.util.Scanner;

public class greatestofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        if(a>b && a>c) {
            System.out.println(" a is greatest  "+a);
        }
        else if (b>a && b>c) {
            System.out.println(" b is greatest  "+b);
        }
        else {
            System.out.println(" c is greatest  "+c);
        }
    }
}
