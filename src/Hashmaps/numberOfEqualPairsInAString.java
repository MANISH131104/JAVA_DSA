package Hashmaps;
import java.util.HashMap;


public class numberOfEqualPairsInAString {
    long equalPairs(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }
        }
        long pairs = 0;
        for(char ch : map.keySet()){
            long freq = map.get(ch);
            pairs += freq*freq;
        }
        return pairs;
    }
}
