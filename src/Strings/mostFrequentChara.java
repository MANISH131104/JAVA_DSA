package Strings;
import java.util.Arrays;

public class mostFrequentChara {
    public static char getMaxOccuringChar(String s) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int maxFreq=-1;
        char ans='a';
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                int freq=j-i;
                if(freq>maxFreq){
                    maxFreq=freq;
                    ans=arr[i];
                }
                i=j;
            }
        }
        int freq=j-i;
        if(freq>maxFreq){
            maxFreq=freq;
            ans=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="manisha";
       char ans= getMaxOccuringChar(s);
        System.out.println(ans);
    }
}
