package string;

public class palindromeInt {

    public static void main(String[] args) {
        int num=121;
        int rev;

        m1(num);
    }
    static void m1(int num){

        StringBuilder sb= new StringBuilder();
        sb.append(num).reverse();

    int   rev=Integer.parseInt(sb.toString());
       if(num==rev){
           System.out.println("palindrome");
       }
       else{
           System.out.println("not palindrome");
       }
    }
}
