package Recursion;
import java.util.Scanner;

public class printOneToNMeth_2 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        print(1);
    }
    public static void print(int x){
        if(x>n) return;
        System.out.println(x);
        print(x+1);
    }
}
