package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollector {

    public static void main(String[] args) {

        String [] stringArr = {"Vijaya", "Abhishek","Richa","Ajay", "Akhansha", "Surbhi","Palak","Suraj","Abhilash","Raja"};

        List<String> names = Arrays.asList(stringArr);

        List<String> ls = names.stream().filter(e->e.endsWith("a")).map(String::toUpperCase).sorted().collect(Collectors.toList());

        System.out.println(ls.get(0));


        List<Integer> numbers = Arrays.asList(5,8,8,6,5,4,1,2,3,9,7,5,4,3);

        //Question - Sort and print unique

        //way 1
//        new HashSet<>(numbers).forEach(System.out::println);

//        way 2
//        numbers.stream().collect(Collectors.toSet()).forEach(System.out::println);

//        way 3
//        numbers.stream().distinct().forEach(e-> System.out.print(e+", "));

//        way4
//        numbers.stream().sorted().forEach(e-> System.out.print(e+", "));

        // way5
        numbers.stream().sorted().distinct().forEach(e-> System.out.print(e+", "));

        //get index three element

        System.out.println("");

        System.out.print("Printing element at 3rd index: ");

        numbers.stream().sorted().distinct().skip(3).findFirst().ifPresent(System.out::print);

        System.out.println("git test");

        System.out.println("git test2");

        System.out.println("git test 3");

        System.out.println("git test 3");

    }
}
