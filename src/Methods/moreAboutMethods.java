package Methods;

public class moreAboutMethods {
    public static void fun1() {
        fun2();
        for(int i=1 ;i<=10 ;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        fun3();
    }
    public static void main(String[] args) {
        System.out.println("yo yo ");
        fun1();
        System.out.println("GIAN ");
        fun2();
        fun3();
    }
    public static void fun3() {
        System.out.println("HOW ARE YOU BRO ");
    }

    public static void fun2() {
        System.out.println("GOOD MORNING ");
    }
    }

