package Strings;
import java.util.*;

public class interning {
    public static void main(String[] args) {
//        String s = "HELLO";
//        String x = "HELLO";
//        x = "MELLO";
//        System.out.println(s);
//        System.out.println(x);


        String s = "HELLO";  // -> HEYLO // 2ND INDEX
        s = s.substring(0,2) + 'Y' + s.substring(3);
        System.out.println(s);
    }
}
