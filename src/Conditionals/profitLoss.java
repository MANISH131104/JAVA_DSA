package Conditionals;
import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP : ");
        int CP;
        CP = sc.nextInt();
        System.out.print("Enter SP : ");
        int SP;
        SP = sc.nextInt();
        if ( SP > CP) {
            System.out.print(" Your Profit is ");
            int profit = SP - CP;
            System.out.println(profit);
//            System.out.println(SP-CP);
        }
        else {
            System.out.print(" Your Loss is ");
            int loss = CP - SP;
            System.out.println(loss);
           // System.out.println(CP-SP);
        }
    }
}
