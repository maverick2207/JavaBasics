package arrayBasics;

import java.util.HashMap;
import java.util.Map;

public class testEY {

    public static void main(String[] args) {
        String s = "abbcchhdjjd";


        char [] c = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();

        for(Character v : c){

            if(m.containsKey(v)){
                m.put(v,m.get(v)+1);
            }else{

                m.put(v,1);
            }

        }

        for(Map.Entry<Character, Integer> e: m.entrySet()){


                System.out.println(e.getKey());





        }
    }
}
