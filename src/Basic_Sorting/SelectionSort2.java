package Basic_Sorting;

public class SelectionSort2 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,-2,6,7,2,0,7,2};
        int n=arr.length;
        print(arr);
        for(int i=n-1 ;i>0 ;i--) {
            int max = Integer.MIN_VALUE;
            int mindx = -1;
            for (int j = i; j>=0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    mindx = j;
                }
            }
            // swap
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);
    }
}
