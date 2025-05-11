package arrayBasics;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateinString {

    public static void main(String[] args) {

        String a = "adbnbbaoauvjmmlaiorppp";

        char [] b = a.toCharArray();

        Map<Character, Integer> m = new HashMap<>();

        for(char c : b){

            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else{
                m.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> k : m.entrySet()){

            if(k.getValue()>1){
                System.out.println("the given character is repeating : "+ k.getKey());
            }

        }
    }
}
