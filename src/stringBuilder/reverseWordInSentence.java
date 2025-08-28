package stringBuilder;
import java.util.*;

public class reverseWordInSentence {
    public static void main(String[] args) {
        String str = "i am manish ";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ;i<str.length() ;i++){
            char ch = str.charAt(i);
            if(ch != ' ') {
                sb.append(ch);
            }
            else {
                sb.reverse();
                ans = ans+sb;
                ans = ans+" ";
              //  sb.delete(0,sb.length());
                sb = new StringBuilder("");
            }
        }
        System.out.println(ans);
    }
}
