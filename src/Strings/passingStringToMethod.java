package Strings;

public class passingStringToMethod {
    public static void change(String x){
        x="keshav";

    }
    public static void main(String[] args) {
        String x="manish";
        System.out.println(x);
        change(x);
        System.out.println(x);      // value is not getting changed so it is called pass by value
    }
}
