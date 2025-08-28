package Loops;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER TERMS : ");
        int n = sc.nextInt();

        // 1 , 3 , 5 ,7 , 9 , .........
//        for ( int i = 1 ; i<= 2*n -1 ; i = i+2) {
//            System.out.print(i+ " ");
//        }



        // method -  2

        int a = 1, d = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a + d;
        }
    }
}
