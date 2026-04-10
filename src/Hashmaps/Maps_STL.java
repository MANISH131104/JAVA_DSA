package Hashmaps;
import java.util.HashMap;

public class Maps_STL {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raghav",25);       // add
        map.put("Manish",21);
        map.put("Aditya",19);
        map.put("Vivek",17);

        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

//        System.out.println(map+" "+map.size());
//        System.out.println(map.remove("Vivek"));
//        System.out.println(map+" "+map.size());
//        System.out.println(map.get("Manish"));
//
//        map.put("Manish",22);
//        System.out.println(map+" "+map.size());
//
//        System.out.println(map.containsKey("Vivek"));
//        System.out.println(map.containsKey("Manish"));

    }

}
