package questionOnBasicJava;
import java.util.Scanner;

public class area0fSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of a square : ");
        int x;
        x = sc.nextInt();
        int area = x * x;
        System.out.println("The area of square is : " +area);

    }
}
