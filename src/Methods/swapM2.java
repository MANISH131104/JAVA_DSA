package Methods;

public class swapM2 {
    public static void swap(int a , int b){
        a = a+b;
        b = a-b;
        a = a-b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);   // ye main function ke liye local hai
    }
}
