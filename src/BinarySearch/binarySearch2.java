package BinarySearch;
import java.util.Arrays;

public class binarySearch2 {
    public static void main(String[] args){
            int[] nums = {2, 4, 7, 8, 9, -3, 1};
            int target = 2;
            int result = search(nums, target);
            System.out.println(result);
        }
        public static int search(int[] nums, int target) {
            int lo = 0, hi = nums.length - 1;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;

                if (nums[mid] == target) return mid;
                else if (nums[mid] < target) lo = mid + 1;
                else hi = mid - 1;
            }

            return -1;
        }
    }
