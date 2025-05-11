package arrayBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MAPTest {

//    static String a1 = "DAD";
//    static String a2 = "ADD";


    public static void main(String[] args) {
        String a3 = "aabbccddbbaavvaaddvvbb";

        char[] b = a3.toCharArray();

        Map<Character, Integer> m = new HashMap<>();

        for (char a : b) {
            if (m.containsKey(a)) {
                m.put(a, m.get(a) + 1);
            } else {
                m.put(a, 1);
            }
        }

        m.forEach((k, v) -> System.out.println(k + "" + k + " ---------> " + v / 2));

//for(Map.Entry<Character,Integer> p:m.entrySet()){
//    System.out.println(p.getKey()+""+p.getKey()+"-----"+p.getValue());
//
//}
        String a1 = "ANT";
        String a2 = "TAN";

        char[] b1 = a1.toCharArray();
        char[] b2 = a2.toCharArray();

        if (b1.length == b2.length) {

            Set<Character> m1 = new TreeSet<>();
            Set<Character> m2 = new TreeSet<>();
            for (char c : b1) {
                m1.add(c);
            }

            System.out.println(m1);

            for (char c : b2) {
                m2.add(c);
            }
            System.out.println(m2);

            if (m1.equals(m2)) {
                System.out.println(" both contains same characters");
            }
            else System.out.println("both contains different characters");
        }
        else System.out.println("length of both string is different");

    }
}
