package Arrays;

public class PassingArrayToMethods {
    public static void change(int[] arr){
        arr[1] = 54;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,34,45};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
}
