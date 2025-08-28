package Arrays;

public class swap {
//    public static void swap(int[] a , int[] b){
//        int temp = a[0];
//        a[0] = b[0];
//        b[0] = temp;
//    }
//    public static void main(String[] args) {
//        int[] a = {10};
//        int[] b = {20};
//        System.out.println(a[0]+" "+b[0]);
//        swap(a,b);
//        System.out.println(a[0]+" "+b[0]);
//    }



    public static void swap(int[] a){
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
    public static void main(String[] args) {
        int[] a = {10,20};
        System.out.println(a[0]+" "+a[1]);
        swap(a);
        System.out.println(a[0]+" "+a[1]);
    }
}
