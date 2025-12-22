package arrayBasics;

import java.util.*;

public class SynchronizedArrayList {

    public static void main(String[] args) {

//        ArrayList<String> ar = new ArrayList<String>();
//        ar.add("abc");

        // Example of using synchronizedList to make an ArrayList thread-safe
        // Note: This is not a common use case in modern Java, as concurrent collections are preferred.
        // However, this example demonstrates how to synchronize access to an ArrayList.
        // Using Collections.synchronizedList to create a thread-safe ArrayList
        // This is a simple example to demonstrate synchronization on an ArrayList.
        // It is generally better to use concurrent collections like CopyOnWriteArrayList or ConcurrentHashMap
        // for thread-safe operations in a multi-threaded environment.
        // Using Collections.synchronizedList to create a thread-safe ArrayList



        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        // Adding elements to the synchronized list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterating over the synchronized list
        synchronized (list){
            Iterator it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }


        // Note: The synchronized block is necessary to ensure that the iteration
        // does not throw a ConcurrentModificationException if the list is modified
        // while iterating over it.

        // Printing the synchronized list
        System.out.println("Synchronized list: " + list);

        // Demonstrating thread-safe operations on the synchronized list

        // Note: When iterating over a synchronized list, it is important to synchronize the block
        // to avoid ConcurrentModificationException. This is because the iterator
        // is not thread-safe and can throw an exception if the list is modified while iterating.
        // Example of adding elements to the synchronized list
        list.add(6);
        list.add(7);
        // Printing the updated list
        System.out.println("Updated list: " + list);


        // Example of iterating over the synchronized list using a for-each loop
        synchronized (list) {
            for (Integer num : list) {
                System.out.println(num);
            }
        }


        // Note: The above code is a simple demonstration of how to use a synchronized list.
        // In practice, you would typically use concurrent collections for thread-safe operations.
        // Example of using CopyOnWriteArrayList for thread-safe operations
        // CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
        // cowList.add(1);
        // cowList.add(2);
        // cowList.add(3);
        // for (Integer num : cowList) {
        //     System.out.println(num);
        // }
        // Note: The CopyOnWriteArrayList is a thread-safe variant of ArrayList
        // that allows for safe iteration without needing to synchronize the block.
    }
}
