package string;

import java.util.Stack;

public class BracketValidNot2 {

    public static void main(String[] args) {

        String str = "({[]})"; // test input
        Stack<Character> stack = new Stack<>();

        boolean balanced = true; // flag to track

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if ( stack.pop() != '(') {
                    balanced = false;
                }
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    balanced = false;
                }
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    balanced = false;
                }
            }
        }

        if (!stack.isEmpty()) balanced = false;

        if (balanced) {
            System.out.println(" Brackets balanced");
        } else {
            System.out.println(" Brackets  NOT balanced");
        }
    }
}