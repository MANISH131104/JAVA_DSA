package Hashmaps;
import java.util.HashMap;

public class PairsWithDifferenceK {
    int countPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
//            if(!map.containsKey(ele)) map.put(ele,1);
//            else{
//                int freq = map.get(ele);
//                map.put(ele,freq+1);
//            }
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int pairs = 0;
        for(int ele : map.keySet()){
            int rem1 = ele-k;
            int rem2 = k+ele;
            if(map.containsKey(rem1)) pairs += (map.get(ele))*(map.get(rem1));
            if(map.containsKey(rem2)) pairs += (map.get(ele))*(map.get(rem2));
        }
        pairs /= 2;
        return pairs;
    }
}
