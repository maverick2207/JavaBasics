package arrayBasics;

import java.util.*;

public class MapSort {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(10, "Dell");
        m.put(13, "Lenovo");
        m.put(11, "Apple");
        m.put(12, "Microsoft");
        m.put(9, "Chrome Book");

        System.out.println("\nSorting a map using Tree map in ascending order");

        TreeMap<Integer, String> t = new TreeMap<>(m);

        System.out.println(t);

        System.out.println("\nSorting a map using Stream in Ascending order based on key");

        Map<Integer, String> a1 = new HashMap<>();

        m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> a1.put(x.getKey(), x.getValue()));

        System.out.println("\nSorted Map in Ascending order based on key = " + a1);

        System.out.println("\nSorting a map using Stream in Ascending order based on value");

        Map<Integer, String> m1 = new HashMap<>();
        m1.put(10, "Dell");
        m1.put(13, "Lenovo");
        m1.put(11, "Apple");
        m1.put(12, "Microsoft");
        m1.put(9, "Chrome Book");

        LinkedHashMap<Integer, String> a2 = new LinkedHashMap<>();

        m1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> a2.put(x.getKey(), x.getValue()));
        System.out.println("\nSorted Map in Ascending order based on value = " + a2);

        System.out.println("\nSorting a map using Stream in Descending order based on key");

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(10, "Dell");
        m2.put(13, "Lenovo");
        m2.put(11, "Apple");
        m2.put(12, "Microsoft");
        m2.put(9, "Chrome Book");

        LinkedHashMap<Integer, String> a3 = new LinkedHashMap<>();

        m2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEachOrdered(x -> a3.put(x.getKey(), x.getValue()));
        System.out.println("\nSorted Map in Descending order based on value = " +a3);

        System.out.println("\nSorting a map using Stream in Descending order based on value");

        Map<Integer, String> m3 = new HashMap<>();
        m3.put(10, "Dell");
        m3.put(13, "Lenovo");
        m3.put(11, "Apple");
        m3.put(12, "Microsoft");
        m3.put(9, "Chrome Book");

        LinkedHashMap<Integer, String> a4 = new LinkedHashMap<>();

        m2.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> a4.put(x.getKey(), x.getValue()));
        System.out.println("\nSorted Map in Descending order based on value = " +a4);
    }


}
