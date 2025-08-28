package stringBuilder;
import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle
        // PHysiCs -> phYSIcS
        for(int i=0 ;i<str.length() ;i++){
            // P -> p
            // check -> alphabet- small,capital
            boolean flag = true; // true -> capital
            char ch = str.charAt(i);        // A
            if(ch==' ') continue;
            int ascii = (int)ch;            //65
            if(ascii>=97) flag = false;
            if(flag==true) {                // capital
                ascii = ascii+32;
                char dh = (char)ascii;      // a
                str.setCharAt(i,dh);
            }
            else {   // small
                ascii = ascii-32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);

    }
}
