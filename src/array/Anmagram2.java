package array;

import java.util.*;

public class Anmagram2 {
    String[] input = {"listen", "silent", "enlist", "rat", "tar", "art", "top", "pot", "opt"};

    void m1(){
        Map<String, String> map = new HashMap<>();

        for (String word : input) {
            // Sort characters in word to create a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // If key already exists, append word to the stored value
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + "," + word);
            } else {
                map.put(key, word);
            }
        }

        // Printing all anagram groups
        for (String group : map.values()) {
            System.out.println(group);
        }
    }

    public static void main(String[] args) {
        Anmagram2 a=new Anmagram2();
        a.m1();
/*
        String[] input = {"listen", "silent", "enlist", "rat", "tar", "art", "top", "pot", "opt"};
        Map<String, List<String>> map=new HashMap<>();

        // method 1
        for(String str: input)
        {
           char[] temp= str.toCharArray();
            Arrays.sort(temp);
            String key=new String(temp);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());  // create new list if not exist
            }
            map.get(key).add(str);
        }
        System.out.println("print map key & value");
        System.out.println(map);

        for(List<String> list:map.values()){
            System.out.println(list);
        }
        }
*/
    }
}
