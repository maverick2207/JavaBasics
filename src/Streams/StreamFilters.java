package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilters {

    public static void main(String[] args) {
        System.out.println("Using For loop");
        List<String> list = new ArrayList<>();

        list.add("Abhishek");
        list.add("Richa");
        list.add("Ajay");
        list.add("Atul");
        list.add("Akhansha");
        list.add("Surbhi");
        list.add("Palak");
        list.add("Suraj");

        System.out.println(list);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("A"))
                count++;
        }
        System.out.println("Count of names using for loop starts with - A: " + count);


        System.out.println("Using Stream");

        long a = list.stream().filter(e -> e.startsWith("A")).count();

        System.out.println("Count of names using streams starts with - A: " + a);

        // instead of creating list we can use of stream.of

/*
  if return is false it will return count as 0,
  because the filter condition always returns false, regardless of the element being processed.
  Since no elements pass the filter (they all get filtered out), the count is 0.

   if we make it true - The count is coming as 8
   because you are returning true for every element, meaning no element is filtered out.
 */

        long c = Stream.of("Abhishek", "Richa", "Ajay", "Atul", "Akhansha", "Surbhi", "Palak", "Suraj")
                .filter(e -> {
                    e.startsWith("A");
                    return true;
                }).count();

        System.out.println(c);

        // printing all name using streams

        list.stream().forEach(e -> System.out.println(e));


    }
}
