package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

import static java.lang.System.*;

public class StreamForEach {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Abhishek");
        list.add("Richa");
        list.add("Ajay");
        list.add("Atul");
        list.add("Akhansha");
        list.add("Surbhi");
        list.add("Palak");
        list.add("Suraj");

        out.println("Printing using streams");

        list.stream().forEach(e-> out.print(e+ ", "));

        out.println("\nAlso We can print like this");

        list.forEach(e -> out.print(e + ", "));

        out.println("");

        list.stream().forEachOrdered(e-> out.print(e+", "));

        //use of filter and foreach

        list.stream().filter(e->e.length()>4).forEach(e-> out.println(e + ", "));

        // using limit

        out.println(">>>>>>> using limit");
        list.stream().filter(e->e.length()>4).limit(2).forEach(e-> out.println(e + ", "));

    }
}
