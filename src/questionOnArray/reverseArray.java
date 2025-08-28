package questionOnArray;

public class reverseArray {
    public static void print(int[] arr){
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,19,56,9,83,18,24,85,14};
        print(arr);
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
       }
        print(arr);


   //     int n = arr.length;
   //     for(int i=0 ;i<n/2 ; i++){
            // swap -> arr[i] and arr[n-1-i]
   //         int temp=arr[i];
   //         arr[i]=arr[n-1-i];
   //         arr[n-1-i] = temp;
   //     }
   //     print(arr);
    }
}
