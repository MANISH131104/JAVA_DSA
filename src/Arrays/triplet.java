package Arrays;
import java.util.Scanner;

public class triplet {
    public static int triplet(int[] arr, int target) {
        int n = arr.length;
        int triplet = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        triplet++;
                    }
                }
            }
        }
        return triplet;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("ENTER ARRAY ELEMENT : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("ENTER TARGET : ");
        int target = sc.nextInt();
        System.out.println("THE NUMBER OF TRIPLET IS : "+triplet(arr,target));
    }
    }

