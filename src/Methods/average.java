package Methods;
import java.util.Scanner;

public class average {
    public static double avg(double a , double b , double c){
        return (a+b+c)/3 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A : ");
        int a = sc.nextInt();
        System.out.print("ENTER B : ");
        int b = sc.nextInt();
        System.out.print("ENTER C : ");
        int c = sc.nextInt();
        double avg = avg(a,b,c);
        System.out.println("THE AVERAGE IS : "+avg);
    }
}
