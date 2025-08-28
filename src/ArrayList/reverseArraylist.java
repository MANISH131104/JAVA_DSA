package ArrayList;
import java.util.ArrayList;

public class reverseArraylist {
    public static void reverselist(ArrayList<Integer> list){
        int i=0;
        int j= list.size()-1;
        while(i<j){
            Integer temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("0RIGINAL ARRAYLIST : "+list);
        reverselist(list);
        System.out.println("REVERSED LIST : "+list);

    }
}
