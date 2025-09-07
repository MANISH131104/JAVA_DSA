package Strings;

public class compareToStringMethod {
    public static void main(String[] args) {
        String a="manish";
        String b="keshav";
        System.out.println(a.compareTo(b));    // 2


        String x="harmeet";
        String y="harsh";
        System.out.println(x.compareTo(y));    //-6


        String str="harsh";
        String gtr="harsh";
        System.out.println(str.compareTo(gtr));   //0


        String p="harshitam";
        String q="harsh";
        System.out.println(p.compareTo(q));     //4
    }
}
