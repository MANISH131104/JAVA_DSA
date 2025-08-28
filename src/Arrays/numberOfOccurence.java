package Arrays;

public class numberOfOccurence {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 5, 8, 3, 5, 2, 5, 9, 5};
        int n = arr.length;
        int x = 5;
        int count = 0;
        for (int i = 0 ; i < n ;i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
