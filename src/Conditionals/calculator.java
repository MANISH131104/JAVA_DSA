package Conditionals;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A : ");
        int a = sc.nextInt();
        System.out.print("ENTER B : ");
        int b = sc.nextInt();
        System.out.print("ENTER OPERATION : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' :
                System.out.println("YOUR RESULT "+(a+b));
                break;

            case '-' :
                System.out.println("YOUR RESULT "+(a-b));
                break;

            case '*' :
                System.out.println("YOUR RESULT IS "+(a*b));
                break;

            case '/' :
                System.out.println("YOUR RESULT IS " +(a/b));
                break;

            case '%' :
                System.out.println("YOUR RESULT IS " +(a%b));
                break;

            default:
                System.out.println("INVALID OPERATOR ");
        }

    }
}
