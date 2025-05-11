package arrayBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * An Iterator is an interface in Java and we can traverse the elements of a
 * list in a forward direction whereas a ListIterator is an interface that
 * extends the Iterator interface and we can traverse the elements in both
 * forward and backward directions. An Iterator can be used in these collection
 * types like List, Set, and Queue whereas ListIterator can be used in List
 * collection only. The important methods of Iterator interface are hasNext(),
 * next() and remove() whereas important methods of ListIterator interface are
 * add(), hasNext(), hasPrevious() and remove().
 */

public class ListIteratorvsIterator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>() {{
            add(4);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};

        System.out.println(list.indexOf(4));

        // printing using iterator
        System.out.println("printing using iterator"+"\n");
        Iterator<Integer> i = list.iterator();

        while (i.hasNext()) {

            System.out.println(i.next());

        }
        // printing using listIterator
        System.out.println("printing using listIterator"+"\n");
        ListIterator<Integer> l = list.listIterator();

        // printing in forward direction
        System.out.println("printing in forward direction"+"\n");
        while(l.hasNext()){
            System.out.println(l.next());
        }

        // printing in backward direction

        System.out.println("printing in backward direction");
        while (l.hasPrevious()){
            System.out.println(l.previous());
        }
        // ListIterator can help to replace an element whereas Iterator cannot.
        System.out.println("ListIterator can help to replace an element whereas Iterator cannot.");

        l.next();
        l.set(10);
        l.next();
        l.add(20);


        System.out.println("\nNow the ArrayList"
                + " elements are: ");
        for (Integer j : list) {
            System.out.println(j);
        }

        ListIterator<Integer> p = list.listIterator();

        p.next();
        p.remove();

        for (Integer k : list) {
            System.out.println(k);
        }
    }
}
