package Arrays;

public class valueAppears {
    public static void main(String[] args) {
        int[] nums = {1,4,5,1,6,4,8,9};
        int n = nums.length;
        int x = 4;
        boolean flag = false;   // every element is distinct
        for(int i=0 ;i<nums.length ;i++){
            if(nums[i] == x) {
               flag = true;
               break;
            }
        }
        if(flag == false){
            System.out.println("EVERY ELEMENT IS DISTINCT ! ");
        }
        else{
            System.out.println("THE VALUE APPEARS TWICE ! ");


        }

    }
}
