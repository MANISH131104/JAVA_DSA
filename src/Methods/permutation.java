package Methods;
import java.util.Scanner;

public class permutation {
    public static int fact(int x){
        int xfact = 1;
        for(int i=1 ;i<=x ;i++){
            xfact = xfact*i ;
        }
        return xfact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n = sc.nextInt();
        System.out.print("ENTER R : ");
        int r = sc.nextInt();
        int npr = fact(n)/fact(n-r);
        System.out.println(npr);
    }
}
