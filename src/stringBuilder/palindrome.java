package stringBuilder;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        /*
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr + "";
        if(str.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

         */

        int i=0 ;
        int j=str.length()-1;
        boolean flag = true;  // true -> palindrome
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.println("palindrome");
        else System.out.println("not palindrome");



    }
}
