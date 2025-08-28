package Conditionals;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int length;
        length = sc.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        int breadth;
        breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("The area of rectangle is " +area);
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of rectangle is " +perimeter);
        if ( area > perimeter) {
            System.out.println("area is greater than perimeter");
        }
        else if (area == perimeter) {
            System.out.println("area and perimeter are equal ");
        }
        else {
            System.out.println("perimeter is greater than area");
        }
    }
}