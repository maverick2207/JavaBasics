package arrayBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable <Student>{

    String name;
    int rollNo;
    int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {

        if(rollNo == o.rollNo)
        return 0;
        else if (rollNo>o.rollNo) return 1;
        else return -1;
    }
}


public class ComparableSort {

    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>(){{
            add(new Student("abcd",35,17));add(new Student("xvbb",37,16));add(new Student("tyhh",20,14));add(new Student("rdtt",15,10));
        }};
        Collections.sort(l);
        l.forEach(x -> System.out.println(x.name + " " +x.rollNo+" "+x.age));
    }


}
