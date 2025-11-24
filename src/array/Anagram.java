package array;

import java.util.*;
//group of anagram
public class Anagram {


    public static void main(String[] args) {

      String[] input = {"listen", "silent", "enlist", "rat", "tar", "art", "top", "pot", "opt"};

     Map<String, List< String>> map=new HashMap<>();
         for(String str:input)
        {
            char[]temp=str.toCharArray();
            Arrays.sort(temp);   // sort the characters

            String key=new String(temp);  // sorted key
            map.computeIfAbsent(key, k->new ArrayList<>()).add(str);

        }
        System.out.println(map);  // print key & values

        // If print only values
         for(List<String> group:map.values())
         {
             System.out.println(group);
         }

    }
}
