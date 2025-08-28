package Loops;

public class predictTheOutput {
    public static void main(String[] args) {
//        int x = 1;
//        while ( x == 1 )
//            x = x - 1;
//        System.out.println(x);

        int x = 4 , y = 0 ;
        while ( x>= 0) {
            x--;
            y++;
            if(x == y)
                continue;
            else
                System.out.println(x+ " "+y);
        }
    }
}
