package stringBuilder;
import java.util.*;

public class stringCompression {
    public static void main(String[] args) {
        String str = "aaabbbbccddde ";
        String ans = "" + str.charAt(0);  // a3b
        int count = 1;
        for(int i=1 ;i<str.length() ;i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                ans = ans+count;
                count = 1;
                ans = ans+curr;
            }
        }
        System.out.println(ans);
    }
}
