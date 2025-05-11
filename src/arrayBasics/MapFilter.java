package arrayBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapFilter {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>(){{put(1,"Rahul m");
            put(2,"Amit k");put(3,"Rahul s");
            put(4,"Rahul g");put(5,"Ritesh s");
            put(6,"Jyoti S");put(7,"Shruti p");

            put(10,"jitu p");put(11,"Rahul a");
            put(12,"preeti K");put(13,"Lakhan r");
            put(14,"ram k");put(15,"Rahul b");
            put(16,"sanjay g");put(17,"avantika l");

            put(20,"prachi l");put(21,"ritesh k");
            put(22,"jyoti l");put(23,"amit g");put(24,"ritesh p");
        }};

        // using old way
//        for(Map.Entry<Integer, String> a : m.entrySet()){
//
////            System.out.println(a.getValue());
//
//            if(a.getValue().toLowerCase().contains("rahul")){
//
//                System.out.println(a.getKey() + " ----- "+a.getValue().toUpperCase());
//            }
//
//        }

        Map<Integer, String> n = m.entrySet().stream().filter(x -> x.getValue().toLowerCase().contains("rahul")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(n);

        //or

        Map<Integer, String> n1 = m.entrySet().stream().filter(x -> x.getValue().toLowerCase().contains("rahul"))
                .collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue().toUpperCase()));

        System.out.println(n1);
    }


}
