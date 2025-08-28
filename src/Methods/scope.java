package Methods;

public class scope {
    static int i;    // global variable
    public static void main(String[] args) {
        i = 16 ;
        System.out.println(i);
        int i = 23 ;    // local variable      ,priority :  local>global
        System.out.println(i);
        fun();
    }
    public static void fun(){
        System.out.println(i);
        int i = 70;    // local variable      , priority : local>global
        System.out.println(i);
    }


}
