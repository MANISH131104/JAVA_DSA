package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print("Pre "+n+" ");      // before call -> pre
        pip(n-1);
        System.out.print("In "+n+" ");      // between two calls -> in
        pip(n-1);
        System.out.print("Post "+n+" ");      // after call -> post
    }
}
