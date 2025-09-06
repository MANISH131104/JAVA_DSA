package Strings;

public class NumberOfVowels {
    public static void main(String[] args) {
        String s="manish kumar";
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;
        }
        System.out.println("Total vowels present in manish is :"+count);
    }
}
