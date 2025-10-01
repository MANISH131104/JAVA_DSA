package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 12, 76, 9, 34, 5};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr,int idx){
        int n=arr.length;
        if(idx == n) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);
    }
}