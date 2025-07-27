package string;

public class PalindromeString {
    public static void main(String[] args) {
        method1();
        method2();
    }
   public static void method1(){
       String name="madAm";
       String rev="";
        for(int i=name.length()-1;i>=0;i--){

            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }

    public static void method2(){
        String name="madAm";
        String rev="";

        StringBuilder sb=new StringBuilder();
        sb.append(name);
        sb.reverse();
        rev= sb.toString();
        if(name.equalsIgnoreCase(rev)){
            System.out.println(name + " :is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
