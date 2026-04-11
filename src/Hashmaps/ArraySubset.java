package Hashmaps;
import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> aMap = new HashMap<>();
        for(int ele : a){
            if(aMap.containsKey(ele)){
                int freq = aMap.get(ele);
                aMap.put(ele,freq+1);
            }
            else aMap.put(ele,1);
        }
        HashMap<Integer,Integer> bMap = new HashMap<>();
        for(int ele : b){
            if(!aMap.containsKey(ele)) return false;
            if(bMap.containsKey(ele)){
                int freq = bMap.get(ele);
                bMap.put(ele,freq+1);
            }
            else bMap.put(ele,1);
        }
        for(int ele : bMap.keySet()){
            int freq = bMap.get(ele);
            int afreq = aMap.get(ele);
            if(afreq<freq) return false;
        }
        return true;
    }
}
