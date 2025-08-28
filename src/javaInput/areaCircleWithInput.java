package javaInput;
import java.util.Scanner;
public class areaCircleWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int radius;
        radius = sc.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The Area Of Circle is "+area);



    }
}
