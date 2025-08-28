package Conditionals;
import java.util.Scanner;

public class youngestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of ram : ");
        int r;
        r = sc.nextInt();
        System.out.print("Enter the age of shyam : ");
        int s;
        s = sc.nextInt();
        System.out.print("Enter the age of ajay : ");
        int a;
        a = sc.nextInt();
        if (r<s && r<a) {
            System.out.println("Ram is younger ");
        }
        else if (s<r && s<a) {
            System.out.println("shyam is younger ");
        }
        else {
            System.out.println("ajay is younger ");
        }
    }
}
