package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramInteger {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,5,5,5,2,1,4);

        Map<Integer, Integer> map= new HashMap<>();

        for(int num: list){
            if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            else {
                map.put(num, +1 );
            }
        }
        System.out.println(map);
          }
    }

