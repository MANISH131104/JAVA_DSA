package TwoDArray.java;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROWS : ");
        int r = sc.nextInt();
        System.out.print("ENTER COLS : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.print("ENTER ELEMENTS : ");
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ;i<r ;i++){
            for(int j=0 ;j<c ;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
