package ProgramPractice;

public class UniqueStringOrNot {

//. Write a java program to find out if the given String has all Unique Characters.
        //input name="Ruttwik";
        //output = t

    public static void main(String[] args) {

        

        String name="Ruttwik";
        //  String name="abcdefg";

        boolean isDublicate=false;


        for( int i=0;i<name.length();i++)
        {
            for(int j=i+1; j<name.length();j++)
            {
                if(name.charAt(i) == name.charAt(j)) {

                    System.out.println("repeate character : " + name.charAt(i));
                    isDublicate = true;
                    break;

                }
            }
        }
        if(isDublicate==true)
        {
            System.out.println("String is not unique");
        }
        else{
            System.out.println("Repeated character not available");
        }


    }
}
