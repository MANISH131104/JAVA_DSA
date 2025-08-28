package questionOnBasicJava;
import java.util.Scanner;

public class avgOfThreeNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number : ");
            double x;
            x = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            double y;
            y = sc.nextInt();
            System.out.print("Enter 3rd number : ");
            double z;
            z = sc.nextInt();
            double avg = (x + y + z)/3;
            System.out.println("The average of these numbers is : " +avg);


        }
}
