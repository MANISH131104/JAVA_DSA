package questionOnArray;

public class MergeTwoSortedArrayMethod2 {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8};

        int[] c = new int[a.length + b.length];
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
        merge(c, a, b);
        for (int ele : c) System.out.print(ele + " ");
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = a.length - 1;
        int j = b.length - 1;
        int k = c.length - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i--;
                k--;
            } else {
                c[k] = b[j];
                j--;
                k--;
            }
        }
        while (i >= 0) {
            c[k] = a[i];
            i--;
            k--;
        }
        while (j >= 0) {
            c[k] = b[j];
            j--;
            k--;
        }
    }
}
