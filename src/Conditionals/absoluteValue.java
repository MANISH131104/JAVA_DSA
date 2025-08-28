package Conditionals;
import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer  : ");
        int n;
        n = sc.nextInt();
        if (n<0) {
            n = n * (-1);
        }
        System.out.println("The absolute value is "+n);

        }

    }

