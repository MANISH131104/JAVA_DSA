package Recursion;
import java.util.Scanner;

public class DecIncr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        print(n);
    }
    public static void print(int n){
//        if(n==1) {
//            System.out.println(n);
//            return;
//        }
        if(n==0) return;
        System.out.println(n);
        print(n-1);
        if(n!=1) System.out.println(n);
    }
}
