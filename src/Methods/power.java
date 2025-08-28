package Methods;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("ENTER BASE B : ");
//        int a;
//        a = sc.nextInt();
//        System.out.print("ENTER B RAISE TO POWER :  ");
//        int b = sc.nextInt();
//        int power = 1;
//        for(int i=1 ;i<=b ;i++) {
//            power = power * a;
//        }
//        System.out.println("power is "+ power);






        // LIBRARY FUNCTIONS

//        System.out.println(Math.pow(4,3));
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.cbrt(8));
//        System.out.println(Math.abs(-8));
//        System.out.println(Math.floor(3.14));   // floor means greatest integer
//        System.out.println(Math.max(8,9));
//        System.out.println(Math.min(4.6,2));
//





//        System.out.print("ENTER A : ");
//        int a = sc.nextInt();
//        System.out.print("ENTER B : ");
//        int b = sc.nextInt();
//        System.out.print("ENTER C : ");
//        int c = sc.nextInt();
//        System.out.println("MAX :  "+ Math.max(a,Math.max(b,c)));




        System.out.print("ENTER A : ");
        int a = sc.nextInt();
        System.out.print("ENTER B : ");
        int b = sc.nextInt();
        System.out.print("ENTER C : ");
        int c = sc.nextInt();
        System.out.print("ENTER D : ");
        int d = sc.nextInt();
        System.out.println("MIN :  "+ Math.min(a,Math.min(b,Math.min(c,d))));
    }
}
