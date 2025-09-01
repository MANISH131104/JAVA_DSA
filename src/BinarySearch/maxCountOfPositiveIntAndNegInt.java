package BinarySearch;

public class maxCountOfPositiveIntAndNegInt {
    public static void main(String[] args) {
        int[] arr = {-5, -4, -3, -1, 0, 0, 0, 1, 2, 6, 8, 9, 10};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int ans = maximumCount(arr);
        System.out.println(ans);
    }
        public static int maximumCount(int[] arr) {
            int n=arr.length;
            int lo=0,hi=n-1;
            int negCount=0;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(arr[mid]>=0) hi=mid-1;
                else{
                    lo=mid+1;
                }
            }
            negCount=lo;
            lo=0;
            hi=n-1;
            int posCount=0;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(arr[mid]<=0) lo=mid+1;
                else{
                    hi=mid-1;
                }
            }
            posCount=n-lo;
            return Math.max(negCount,posCount);
        }
}
