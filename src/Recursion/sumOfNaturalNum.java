package Recursion;
import java.util.Scanner;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= sc.nextInt();
        int ans = findSum(n);
        System.out.println(ans);
    }
    public static int findSum(int n){
        if(n==1) return 1;
        else return n+findSum(n-1);
    }
}
