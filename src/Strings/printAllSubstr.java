package Strings;

public class printAllSubstr {
    public static void main(String[] args) {
        String s="manish";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" ");       // 1 to j
            }
            System.out.println();
        }
    }
}
