package arrayBasics;

import java.util.*;

public class ArrayListSync {

    public static void main(String[] args) {

//        ArrayList<String> ar = new ArrayList<String>();
//        ar.add("abc");

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        synchronized (list){
            Iterator it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
