package data_structure_basics.priority_queue;


import java.util.Comparator;
import java.util.PriorityQueue;

class Students{

    String name;
    double cgpa;

    public Students(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString(){
        return name+" (CGPA: "+cgpa+")";
    }

}
public class PQUsingComparatorCustomObject {

    public static void main(String[] args) {
        PriorityQueue<Students> queue = new PriorityQueue<>(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return (int)Double.compare( o1.cgpa,  o2.cgpa);
            }
        });

        queue.add(new Students("Suraj", 7.65));
        queue.add(new Students("Palak", 9.3));
        queue.add(new Students("Arnav", 4.58));
        queue.add(new Students("Alka", 5.49));
        queue.add(new Students("Surbhi", 9.5));

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
