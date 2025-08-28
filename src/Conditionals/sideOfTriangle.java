package Conditionals;
import java.util.Scanner;

public class sideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 : ");
        int x;
        x = sc.nextInt();
        System.out.print("Enter side 2 : ");
        int y;
        y = sc.nextInt();
        System.out.print("Enter side 3 : ");
        int z;
        z = sc.nextInt();
        if (x+y > z && y+z > x && z+x > y) {
            System.out.println("IT CAN BE THE SIDES OF A TRIANGLE ");
        }
        else {
            System.out.println("IT CAN NOT BE THE SIDES OF A TRAINGLE ");
        }
    }
}
