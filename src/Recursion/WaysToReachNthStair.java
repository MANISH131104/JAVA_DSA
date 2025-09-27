package Recursion;
import java.util.Scanner;

public class WaysToReachNthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Stair : ");
        int n= sc.nextInt();
        int ans = countWays(n);
        System.out.println(ans);
    }
    public static int countWays(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return countWays(n-1)+countWays(n-2);
    }
}
