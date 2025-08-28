package Methods;
import java.util.Scanner;

public class combination {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("ENTER N : ");
//        int n = sc.nextInt();
//        System.out.print("ENTER R : ");
//        int r = sc.nextInt();
//
//        int nfact = 1;
//        for (int i=1 ;i<=n ;i++) {
//            nfact = nfact*i;
//        }
//
//        int rfact = 1;
//        for(int i=1 ;i<=r ;i++) {
//            rfact = rfact*i ;
//        }
//
//        int n_rfact = 1;
//        for(int i=1 ;i<=n-r ;i++){
//            n_rfact = n_rfact*i ;
//        }
//        int ncr = nfact/(rfact*n_rfact) ;
//        System.out.println(ncr);
//    }

public static int fact(int x){
    int xfact = 1;
    for(int i=1 ;i<=x ;i++) {
        xfact = xfact * i;
    }
    return xfact ;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER N : ");
        int n = sc.nextInt();
        System.out.print("ENTER R : ");
        int r = sc.nextInt();
//        int nfact = fact(n);
//        int rfact = fact(r);
//        int n_rfact = fact(n-r);
        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
    }

}
