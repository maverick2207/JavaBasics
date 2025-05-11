package arrayBasics;

import java.util.*;

public class CollectionSort {

    public static void main(String[] args) {
        List<String> s = new ArrayList<String>(){{add("CAT");add("DOG");add("Apple");add("LUDO");}};

        System.out.println("Sorting ArrayList in ascending order");

        Collections.sort(s);

        ArrayList list4 = new ArrayList();
        list4.add("a");
        list4.add(1);
        list4.add('a');


        System.out.println("\nModified List : "+s);

        System.out.println("Sorting ArrayList in Reverse order");

        Collections.sort(s, Collections.reverseOrder());

        System.out.println("\nModified List : "+s);

        // Collections.sort on map won't work

        Map<Integer, String> m = new HashMap<>();
        m.put(10, "Dell");
        m.put(13, "Lenovo");
        m.put(11, "Apple");
        m.put(12, "Microsoft");
        m.put(9, "Chrome Book");







    }
}
