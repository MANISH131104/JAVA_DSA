package BinarySearch;

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int target=9;
        int ans=search(arr,target);
        System.out.println("The element is present at index:"+ans);
    }
    public static int search(int[] arr,int target) {
        int n=arr.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[lo] <= arr[mid]) {  // lo to mid is sorted
                if (arr[lo] <= target && target < arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            } else { // mid to hi is sorted
                if (arr[mid] < target && target <= arr[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }
}
