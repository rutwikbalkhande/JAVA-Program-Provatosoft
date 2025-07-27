package array;

import java.util.*;

public class Anmagram2 {



    public static void main(String[] args) {

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
}
