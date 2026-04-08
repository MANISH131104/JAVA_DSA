package Maps_And_Sets;
import java.util.HashSet;

public class DistinctElements {
    static int distinct(int arr[]) {
        int Element = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        Element = set.size();
        return Element;

//        HashSet<Integer> set = new HashSet<>();
//        for(int ele : arr) set.add(ele);
//        return set.size();

    }
}
