package arrayBasics;

import java.util.HashMap;
import java.util.Map;

public class MapOfMap {

    public static void main(String[] args) {
        Map<String, Map<String, Map<String, String>>> m1 = new HashMap<>();

        Map<String, Map<String,String>> m2 = new HashMap<>();

        Map<String, String> m3 = new HashMap<>();

        m3.put("$ 10", "$ 20");
        m3.put("$ 50", "$ 20");
        m3.put("$ 100","$ 15");
        m3.put("$ 75", "$ 35");

//        m3.entrySet().stream().forEach(x-> System.out.println(x.getKey()+","+x.getValue()));

        m2.put("ram",m3);
        m2.put("shyam",m3);
        m2.put("prakash",m3);

        m1.put("10/12/2020",m2);
        m1.put("11/12/2020",m2);
        m1.put("12/12/2020",m2);

//        System.out.println(m1);

        m1.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" , "+x.getValue()));

        m1.forEach((x,y) -> System.out.println(x +" " +y));

    }
}
