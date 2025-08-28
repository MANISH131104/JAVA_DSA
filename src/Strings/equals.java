package Strings;
import java.util.*;

public class equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
//        System.out.println(s1==s2);  // true (adress same hai )
//        System.out.println(s1==s3);  // false (adress diferent hai )
        System.out.println(s1.equals(s2)); // true (ye pure string dekhta hai )
        System.out.println(s1.equals(s3));  // true
    }
}
