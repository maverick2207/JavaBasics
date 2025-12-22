package arrayBasics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bank {

    int id;
    String name;
    int salary;

    public Bank(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " --- " + salary + " --- " + name;
    }

}

class IDComparator implements Comparator<Bank> {

    @Override
    public int compare(Bank ID1, Bank ID2) {

        if (ID1.id == ID2.id) {
            return 0;
        } else if (ID1.id > ID2.id) {
            return 1;
        } else return -1;
    }
}

class NameComparator implements Comparator<Bank> {

    @Override
    public int compare(Bank name1, Bank name2) {

        return name1.name.compareTo(name2.name);
    }
}

class SalaryComparator implements Comparator<Bank> {

    @Override
    public int compare(Bank salary1, Bank salary2) {

        return Integer.compare(salary1.salary, salary2.salary);
    }
}


public class ComparatorSort {

    // This is the main method where the program starts execution
    // It creates a list of Bank objects and sorts them using different comparators
    public static void main(String[] args) {
        // Create a list of Bank objects
        List<Bank> s = new ArrayList<>();

        // Add Bank objects to the list
        s.add(new Bank(10178, "acbn", 29000));
        s.add(new Bank(11220, "aabv", 25000));
        s.add(new Bank(11178, "aklf", 27000));
        s.add(new Bank(10178, "amlf", 31000));
        s.add(new Bank(19178, "amkk", 31200));

        System.out.println("Sorting by ID");

        // Sort the list by ID using IDComparator
        Collections.sort(s, new IDComparator());
        s.forEach(x -> System.out.println(x.id + " --- " + x.salary + " --- " + x.name));

        System.out.println("Sorting by Name");

        // Sort the list by Name using NameComparator
        Collections.sort(s, new NameComparator());
        s.forEach(x -> System.out.println(x.id + " --- " + x.salary + " --- " + x.name));

        System.out.println("Sorting by Salary");
        // Sort the list by Salary using SalaryComparator
        Collections.sort(s, new SalaryComparator());
        s.forEach(System.out::println);

    }
}

