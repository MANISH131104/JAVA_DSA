package Strings;

public class palindrome {
    public static void main(String[] args) {
        String s="malayalam";
        int n=s.length();
        System.out.println(s);
        boolean flag=false;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)) {
                flag=true;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("malayalam is palindrome");
        }
        else{
            System.out.println("malayalam is not palindrome");
        }
    }
}
