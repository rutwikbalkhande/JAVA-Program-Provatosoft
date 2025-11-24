package string;

import java.util.Arrays;

public class CountWordsInString {

    public static void main(String[] args) {
       String name="Rutwik hello";

      String a[]=  name.trim().split("\\s+");

        System.out.println(Arrays.toString(a));
      int count=0;
      for(String word : a){
          System.out.println(word);
          count++;
      }
       System.out.println(count);
    }
}
