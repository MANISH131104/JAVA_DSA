package Conditionals;
import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER TEMPERATURE : ");
        double temp = sc.nextDouble();
        if ( temp>100 ) {
            System.out.println("YOU HAVE FEVER ");
        }
        else {
            System.out.println("NO FEVER ");
        }
    }
}
