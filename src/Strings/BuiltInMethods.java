package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s="Manish Kumar";
        System.out.println(s.indexOf('m'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('y'));

//        s.toUpperCase();
//        System.out.println(s);                    // aisa nahi hota
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());


        String x="manisha";
        System.out.println(x.contains("manish"));     // true
        if(x.contains("ani")) {
            System.out.println("happy");
        }

        System.out.println(x.startsWith("mani"));    // true
        System.out.println(x.endsWith("isha"));      // true

    }
}
