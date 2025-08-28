package questionOnArray;

public class reverseParticularPart {
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
        int i=2;
        int j=5;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print(arr);
    }
}
