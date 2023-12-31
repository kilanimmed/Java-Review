package src;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Sergiu");
        map.put(2,"Moses");
        System.out.println(map.get(2));// I am putting the key value not an index
        System.out.println(findFirstNonRepeating("Cydeo Java Developer"));
    }
    public static Character findFirstNonRepeating(String str){
        Map<Character,Integer> map=new HashMap<>();
        int count;
        for(Character ch:str.toCharArray()){
            if(map.containsKey(ch)){
                count=map.get(ch);
                map.put(ch, count+1);
            }else map.put(ch, 1);
        }
        for(Character ch:str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return Character.MAX_VALUE;
    }
}
