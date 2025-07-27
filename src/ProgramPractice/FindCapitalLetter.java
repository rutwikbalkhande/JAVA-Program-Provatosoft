package ProgramPractice;

public class FindCapitalLetter {
    public static void main(String[] args) {
        String name="RUtwik";

      char[] str=  name.toCharArray();

      for(int i=0;i<str.length;i++){

          for(int j=0;j<str.length;j++){
              if(str[i]==Character.toUpperCase(str[j])){
                  System.out.println(str[i]);
              }
          }

      }
    }
}
