package Recursion;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter n : ");
            int n=sc.nextInt();
          int fact= factorial(n);
        System.out.println(fact);
        }
        public static int factorial(int n){
        if(n==0 || n==1) return 1;
        int ans = n*factorial(n-1);
        return ans;
        }
    }

