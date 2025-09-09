package stringBuilder;

public class reverseString {
    public static void main(String[] args) {
        String s="keshav";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
}
