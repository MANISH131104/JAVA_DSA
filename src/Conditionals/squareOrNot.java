package Conditionals;
import java.util.Scanner;

public class squareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of a rectangle : ");
        int length;
        length = sc.nextInt();
        System.out.print("Enter breadth of a rectangle : ");
        int breadth;
        breadth = sc.nextInt();
        if ( length == breadth){
        System.out.println("Rectangle is a square ");
    }
    else {
            System.out.println("rectangle is not a square");
        }
    }
}
