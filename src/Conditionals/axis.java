package Conditionals;
import java.util.Scanner;

public class axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate : ");
        int y = sc.nextInt();
        if (x==0 && y==0) {
            System.out.println("AT ORIGIN");
        }
        else if (x==0) {
            System.out.println("Y AXIS");
        }
        else if( y== 0) {
            System.out.println("X AXIS");
        }
        else {
            System.out.println("INVALID DATA");
        }

    }
}
