package Recursion;
import java.util.ArrayList;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s = "Manish";
        change(s);
        System.out.println(s);

        String[] arr = {"Manish","Keshav","Raja","Rahul"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        ArrayList<String> al = new ArrayList<>();
        al.add("Tannu");
        al.add("Khushi");
        al.add("Anjali");
        al.add("Riya");
        al.add("Roshni");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(ArrayList<String> al) {
        al.add("Puja");
    }

    private static void change(String s){
        s = "lavish";
    }
}
