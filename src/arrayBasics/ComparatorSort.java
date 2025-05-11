package arrayBasics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bank {

    int id ;
    String name;
    int salary;

    public Bank(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

}

class IDComparator implements Comparator<Bank>{

    @Override
    public int compare(Bank ID1, Bank ID2) {

        if(ID1.id == ID2.id){
            return 0;
        }
        else if (ID1.id> ID2.id){
            return 1;
        }
        else return -1;
    }
}

class NameComparator implements Comparator<Bank>{

    @Override
    public int compare(Bank name1, Bank name2){

        return name1.name.compareTo(name2.name);
    }
}
public class ComparatorSort {

    public static void main(String[] args) {
        List<Bank> s = new ArrayList<>(){{
            add(new Bank(11220,"aabv", 25000));add(new Bank(11178,"aklf", 27000));
            add(new Bank(10178,"amlf", 31000));add(new Bank(19178,"amkk", 31200));
        }};

        System.out.println("Sorting by ID");
        Collections.sort(s, new IDComparator());
        s.forEach(x-> System.out.println(x.id+" --- "+x.salary+" --- "+x.name));

        System.out.println("Sorting by Name");
        Collections.sort(s, new NameComparator());
        s.forEach(x-> System.out.println(x.id+" --- "+x.salary+" --- "+x.name));

    }
}
