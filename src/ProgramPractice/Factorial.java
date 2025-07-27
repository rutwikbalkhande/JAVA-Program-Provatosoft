package ProgramPractice;

public class Factorial {
    public static void main(String[] args) {
        int f=5;
        int fact=1;
        for(int i=1;i<=f;i++){
        fact=fact*i;
        }
        System.out.println("factorial: "+ fact);
    }

}
