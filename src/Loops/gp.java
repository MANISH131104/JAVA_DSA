package Loops;
import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER TERMS : ");
        int n = sc.nextInt();

        // 1 ,2 ,4 ,8 ,16 ,32 , .........
        int a = 1;
        int r = 2;   // r is common ratio
        for (int i = 1 ; i<= n ; i++){
            System.out.print(a+ " ");
            a = a*r;
        }
    }
}
