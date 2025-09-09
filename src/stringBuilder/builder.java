package stringBuilder;
import java.util.*;

public class builder {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("hello");
//        System.out.println(str);   // hello
//        // hello -> mello
//        str.setCharAt(0,'m');
//        System.out.println(str);     // mello
//        str.append(" world");
//        System.out.println(str);     // mello world
//
//        str.insert(2,'y');   // insert
//        System.out.println(str);       // meyllo world
//
//        str.deleteCharAt(0);
//        System.out.println(str);      // eyllo world



        StringBuilder sb = new StringBuilder("MANISH");
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        String t=sb.toString();
        System.out.println(t);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        // MANISH
       // sb.delete(0,3);           // 0 to 2 delete
        //System.out.println(sb);   // ISH

        System.out.println(sb);
        System.out.println(sb.substring(0,2));
        System.out.println(sb.substring(3));




    }
}
