package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        // n-1 disk from A to B via C
        hanoi(n-1,a,c,b);
        // largest from A to C
        System.out.println(a+"->"+c);
        // n-1 disk from B to C via A
        hanoi(n-1,b,a,c);
    }
}
