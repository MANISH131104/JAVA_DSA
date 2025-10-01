package Recursion;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
//        int a=60;
//        int b=40;
//        int HCF=1;
//        for(int i=2;i<Math.min(a,b);i++) {
//                if (a % i == 0 && b % i == 0) {
//                    HCF = i;
//                }
//            }
//        System.out.println(HCF);


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b= sc.nextInt();
        int ans = hcf(a,b);
        System.out.println(ans);
    }
//    public static int hcf(int a,int b){
//        if(a==0) return b;
//        return hcf(b%a,a);
//    }


    public static int hcf(int a,int b){
        return helper(Math.min(a,b),Math.max(a,b));
    }
    public static int helper(int a,int b){
        if(a==0) return b;
       return helper(b%a,a);
    }
}
