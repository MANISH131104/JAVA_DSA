package Methods;
import java.util.Scanner;

public class swap {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A : ");
        int a = sc.nextInt();
        System.out.print("ENTER B: ");
        int b = sc.nextInt();
        System.out.println("BEFORE SWAPING : "+a+" "+b);
//       int temp = a;
//       a = b;
//       b = temp;


        a = a+b ;
        b = a-b ;
        a = a-b ;
        System.out.println("AFTER SWAPING : "+a+" "+b);

    }
}