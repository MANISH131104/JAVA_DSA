package Conditionals;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage : ");
        int n;
        n = sc.nextInt();
        if(n>90) {
            System.out.println("EXCILLANT");
        }
        else if (n>80) {
            System.out.println("VERY GOOD");
        }
        else if (n>70) {
            System.out.println("GOOD");
        }
        else if (n>60) {
            System.out.println("CAN DO BETTER");
        }
        else if (n>50) {
            System.out.println("AVERAGE");
        }
        else {
            System.out.println("FAIL");
        }
    }
}
