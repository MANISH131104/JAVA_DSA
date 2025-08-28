package Conditionals;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year;
        year = sc.nextInt();
        if ( year%4 == 0 ) {
            System.out.println(" LEAP YEAR");
        }
        else {
            System.out.println("NOT A LEAP YEAR ");
        }



    }
}
