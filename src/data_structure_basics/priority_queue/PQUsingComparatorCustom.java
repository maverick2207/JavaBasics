package data_structure_basics.priority_queue;


import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    String name;
    int percentage;

    public Student(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return name + " (Percentage: " + percentage + ")";
    }
}

class StudentComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        if (s1.percentage < s2.percentage)
            return -1;
        else if (s1.percentage > s2.percentage)
            return 1;
        return 0;
    }
}

public class PQUsingComparatorCustom {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new StudentComparator());
        queue.add(new Student("Suraj", 76));
        queue.add(new Student("Palak", 93));
        queue.add(new Student("Arnav", 35));
        queue.add(new Student("Alka", 54));
        queue.add(new Student("Surbhi", 95));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
