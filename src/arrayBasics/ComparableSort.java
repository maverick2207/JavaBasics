package arrayBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.util.*;

// Student class implements Comparable interface to allow natural ordering (based on rollNo)
class Student implements Comparable<Student> {

    String name;
    int rollNo;
    int age;

    // Constructor to initialize Student object
    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Overriding compareTo method to sort students by roll number
    @Override
    public int compareTo(Student o) {
        // Using built-in Integer.compare for cleaner comparison
        return Integer.compare(this.rollNo, o.rollNo);
    }
    /*
     * Alternative implementation of compareTo using subtraction
     * This can lead to overflow issues, so it's generally safer to use Integer.compare
     */
    
    // Alternative implementation of compareTo using if-else
   /* @Override
    public int compareTo(Student o) {
        if (rollNo == o.rollNo) return 0;
        else if (rollNo > o.rollNo) return 1;
        else return -1;
    }*/


    // Overriding toString for cleaner and reusable printing
    @Override
    public String toString() {
        return name + " " + rollNo + " " + age;
    }
}

public class ComparableSort {

    public static void main(String[] args) {
        // Creating a list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("abcd", 35, 17));
        studentList.add(new Student("xvbb", 37, 16));
        studentList.add(new Student("tyhh", 20, 14));
        studentList.add(new Student("rdtt", 15, 10));

        // Sorting the student list based on roll number (natural ordering defined in compareTo)
        Collections.sort(studentList);

        // Printing each student object
        studentList.forEach(System.out::println);
    }
}

