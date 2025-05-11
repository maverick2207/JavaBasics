package Streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.SocketHandler;
import java.util.stream.Stream;

public class StreamMap {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Anjana");
        list.add("Rajni");
        list.add("Aarav");
        list.add("Angad");
        list.add("Virushka");
        list.add("Sanjana");
        list.add("Prachi");
        list.add("Sujeet");

        list.stream().filter(e -> e.endsWith("a")).map(e -> e.toLowerCase()).forEach(e-> System.out.println(e));

        list.stream().filter(e -> e.endsWith("k")).map(e -> e.toUpperCase()).forEach(e-> System.out.println(e));

        //converting Arrays to arrays list

        String [] stringArr = {"Vijay", "Abhishek","Richa","Ajay", "Akhansha", "Surbhi","Palak","Suraj","Abhilash"};

        List<String> name = Arrays.asList(stringArr);

        System.out.println("Printing list after converting from array: "+name);

        name.stream().map(e->e.toUpperCase()).forEach(e-> System.out.print(e+", "));

        System.out.println("");
        name.stream().map(e->e.toUpperCase()).filter(e ->e.startsWith("A")).forEach(e-> System.out.print(e+", "));

        System.out.println("");
        name.stream().map(String::toLowerCase).sorted().forEach(e-> System.out.print(e+", "));

        //Array concatenation
        //once Stream is modified it cannot be reused

        System.out.println("\nConcatenation of two list and printing");
        Stream<String> newString = Stream.concat(list.stream(),name.stream());

//        newString.forEach(System.out::println);

//        newString.filter(e->e.endsWith("a")).forEach(e-> System.out.println(e));

        boolean value = newString.anyMatch(e->e.equalsIgnoreCase("palak"));

        System.out.println("Palak is present in stream list: "+value);
    }
}
