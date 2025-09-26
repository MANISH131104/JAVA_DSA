package Recursion;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int ans = reverse(n,0);
        System.out.println(ans);
    }
    public static int reverse(int n,int r){
       if(n==0) return r;
       return reverse(n/10,r*10+n%10);
    }
}
