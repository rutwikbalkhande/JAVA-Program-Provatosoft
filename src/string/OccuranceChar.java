package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceChar {

    //. Write a java program to count occurrences of each character in String in
    //input :  str="Java Hungry";
    // output : character occurance: { =1, a=2, r=1, u=1, v=1, g=1, H=1, y=1, J=1, n=1}

    public void character(){

        String str = "Java HungryY";
        System.out.println("character:");
        Map <Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if( map.containsKey(c))
            {
                map.put(c, map.get(c) +1);
            }
            else{
                map.put(c, +1);
            }
        }
        System.out.println(map);
    }

    void number(){
        List<Integer> list= Arrays.asList(1,1,2,2,2,5,5,4);
        System.out.println("number:");

        Map<Integer, Integer> map=new HashMap<>();
        for(int num: list){

            if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            else{
                map.put(num, +1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        OccuranceChar o = new OccuranceChar();
           o.character();
           o.number();
    }}


