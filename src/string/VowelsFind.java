package string;

public class VowelsFind {
    public static void main(String[] args) {

        String name= "Rutwiok";

        String vowelFound=name.replaceAll("[^aeiouAEIOU]","");

        String nonVowel=name.replaceAll("[AEIOUaeiou]","");

        //^ inside [] negates the character set. So it removes: all characters except vowels
        // replaceAll = remove non vowel character

        if(!vowelFound.isEmpty()){
            System.out.println("present vowel :" + vowelFound);
            System.out.println("non Vowel char: "+nonVowel);
        }
        else{
            System.out.println("not found");
        }
    }
}
