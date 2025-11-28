package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsValidNot {
// check opening closing brackets are correct or not use stack bez follow LIFO ?
//        "Push" = add data in stack , "peek()" = get last added element {LIFO based} , "pop()" = delete element

    public static void main(String[] args) {

        String str = "({[]})";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets → push
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Closing brackets → must match
            else {
                if (st.isEmpty()) {
                    System.out.println("not balance");
                    return;
                }


                // Check matching pair
                if ((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}') || (st.peek() == '[' && ch == ']')) {

                    st.pop();  // matched → remove
                }
                else {
                    System.out.println("not balance");
                    return;
                }
            }
        }

        // 3️⃣ If stack empty → balanced
        if (st.isEmpty()) {
            System.out.println("balance");
        } else {
            System.out.println("not balance");
        }
    }
}