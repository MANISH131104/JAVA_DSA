package Recursion;

public class firstOccurance {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,4,5,6};
        int n=arr.length;
        int x=3;
        int result = firstOccurance(arr,0,n-1,x);
        System.out.println(result);
    }
    public static int firstOccurance(int[] arr,int lo,int hi,int x){
        if(lo>hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(arr[mid]>x) return firstOccurance(arr,lo,mid-1,x);
        else if(arr[mid]<x) return firstOccurance(arr,mid+1,hi,x);
        else {
            if (mid == 0 || arr[mid - 1] != x) return mid;
            else return firstOccurance(arr, lo, mid - 1, x);
        }
    }
}
