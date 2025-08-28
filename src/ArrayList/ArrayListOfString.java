package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfString {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("WELCOME");
        l1.add("TO");
        l1.add("CODING");
        l1.add("WORLD");
        System.out.println("Original ArrayList : "+l1);
        Collections.sort(l1);
        System.out.println("Sorted ArrayList : "+l1);
    }
}
