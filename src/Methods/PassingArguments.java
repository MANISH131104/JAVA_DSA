package Methods;

public class PassingArguments {
//    public static void greet(String name){
//        System.out.println("GOOD MORNING "+name);
//    }
//    public static void main(String[] args) {
//        greet("MANISH KUMAR");
//        greet("VIRAT KOHLI");
//
//    }


//    public static void main(String[] args) {
//        sum(8,9,7);
//    }
//    public static void sum(int a , int b , int c) {
//        System.out.println("sum is " +(a+b+c));
//    }


    public static void main(String[] args) {
        intro("MANISH" ,20);
        intro("MEGHA",19);
    }
    public static void intro(String name,int age){
        System.out.println("HELLO  "+name+"  YOUR AGE IS "+age);

    }
}
