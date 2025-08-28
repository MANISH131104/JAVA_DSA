package Strings;
import java.util.*;

public class toggle {
    public static void main(String[] args) {
        String str = "PhYSiCS";
        System.out.println(str);
       // StringBuilder sb = new StringBuilder(str)
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
              str = str.substring(0,i)+dh+str.substring(i+1);
            }
            else {   // small
                ascii = ascii-32;
                char dh = (char)ascii;
                str = str.substring(0,i)+dh+str.substring(i+1);

            }
        }
        System.out.println(str);
    }
}
