package ArrayList;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
   //     ArrayList<Integer> arr = new ArrayList<>();


        // ADD NEW ELEMENT
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);


        // GET AN ELEMENT AT INDEX i
       // System.out.println(l1.get(1));   // 6



        /*
        PRINT WITH FOR LOOP
        for(int i=0 ;i<l1.size() ;i++){
            System.out.println(l1.get(i));
        }
         */

        // PRINTING THE ARRAYLIST DIRECTLY
        System.out.println(l1);   // [5,6,7,8]

        // ADDING ELEMENT AT SOME INDEX i
        l1.add(1 ,100);
        System.out.println(l1);   // [5,100,6,7,8]


        // MODIFYING ELEMENT AT INDEX i
        l1.set(1,10);
        System.out.println(l1);  // [5,10,6,7,8]


        // Removing an element at index i
        l1.remove(1);
        System.out.println(l1);  // [5,6,7,8]


        // Removing an element e without knowing the index
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);  // [5,6,8]



        // Checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(16));
        System.out.println(ans);


        // IF YOU DON'T SPECIFY CLASS , YOU CAN PUT ANYTHING INSIDE l
        ArrayList l = new ArrayList();
        l.add("PQRES");
        l.add(1);
        l.add(true);
        System.out.println(l);







    }
}
