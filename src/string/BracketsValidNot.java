package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsValidNot {

    public static void main(String[] args) {

        String str = "({[]})";

        Stack<Character> stack =new Stack<>();

        boolean balenced= false;

        for(char ch : str.toCharArray()){

            //opening bracket
            if(ch== '(' || ch== '}' || ch== ']'){
                 stack.push(ch);
            }
            else if (ch == ')')
            {
               if(stack.pop() != '(' );
               balenced= false;
            }
            else if(ch== '}'){
                if(stack.pop() != '{');
                balenced= false;
            }
            else if(ch == ']')
            {
                if(stack.pop() != '[');
                balenced= false;
            }
        }
        if(balenced){
            System.out.println("perfect");
        }
        else{
            System.out.println("not");
        }

    }
}
