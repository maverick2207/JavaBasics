package arrayBasics;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindDuplicateArrayusingMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> l = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(6);
                add(5);
                add(8);
                add(9);
                add(10);
                add(9);
            }

        };
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(3);
//		l.add(4);
//		l.add(5);
//		l.add(6);
//		l.add(7);
//		l.add(6);
//		l.add(8);
//		l.add(9);
//		l.add(9);
//		l.add(10);
//		l.add(11);
//
        Map<Integer, Integer> m = new HashMap<>();

        for (Integer i : l) {
            if (m.containsKey(i)) {
                m.put(i, m.get(i) + 1);
            } else
                m.put(i, 1);
        }
        m.forEach((k, v) ->
                System.out.println("key:" + k + "" + "value:" + v));

        for (Entry<Integer, Integer> s : m.entrySet()) {

            if (s.getValue() > 1) {
                System.out.println(s.getKey() + " is repeating");
            } else {
                System.out.println(s.getKey() + " is not repeating");
            }
        }


        // finding Duplicate element using stream

        System.out.println("finding Duplicate element using stream");

        Set<Integer> s = new HashSet<>();

        Set<Integer> p = l.stream().filter(x -> !s.add(x)).collect(Collectors.toSet());

        System.out.println(p);
    }

}
