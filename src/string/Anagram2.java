package string;

import java.util.*;

public class Anagram2 {
    public static void main(String[] args) {

        String name[]={"eat","tea","tan","ate","nat","bat"};
        // Map of sorted word -> list of words
     Map<String, List<String>> map = new HashMap<>();

        for(String str: name){
              char c[]= str.toCharArray();
            Arrays.sort(c);

            String key= new String(c);

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(str);
        }
        // Convert values to List<List<String>>
        List<List<String>> list = new ArrayList<>(map.values());

        System.out.println("list: " + list);
        System.out.println("map: " + map);

    }


}
