package Conditionals;
import java.util.Scanner;

public class nestedYoungest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of ram : ");
        int a = sc.nextInt();
        System.out.print("Enter age of shyam : " );
                int b = sc.nextInt();
        System.out.println("Enter age of raghav : ");
        int c = sc.nextInt();
        if (a<b) {
            if (a<c) {
                System.out.println("Ram is youngest ");
            }
            else {
                System.out.println("Raghav is youngest ");
            }
        }
        else {
            if (b<c) {
                System.out.println("Shyam is youngest ");
            }
            else {
                System.out.println("Raghav is youngest ");
            }
        }



    }
}
