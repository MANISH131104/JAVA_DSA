package questionOnBasicJava;
import java.util.Scanner;

public class productBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of a pen : ");
        double x;
        x = sc.nextInt();
        System.out.print("Enter price of a Pencil : ");
        double y;
        y = sc.nextInt();
        System.out.print("Enter price of an Erassor :");
        double z;
        z = sc.nextInt();
        double gst = (x+y+z)/100*18;
        double total_price = x + y + z + gst;
        System.out.println("cost of all these items with gst  : " +total_price);


    }
}
