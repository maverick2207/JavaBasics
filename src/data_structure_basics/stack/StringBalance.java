package data_structure_basics.stack;

import java.util.Stack;

public class StringBalance {

    public static void main(String[] args) {

        String str1 = "{[()]}";
        String str2 = "{[(])}";
        String str3 = "()";
        String str4 = "([)]";
        String str5 = "";
        String str6 = "( )[ { } ( ) ]";

        System.out.println("is string balance - "+ str1 + " : " + isBalanced(str1));
        System.out.println("is string balance - "+ str2 + " : " + isBalanced(str2));
        System.out.println("is string balance - "+ str3 + " : " + isBalanced(str3));
        System.out.println("is string balance - "+ str4 + " : " + isBalanced(str4));
        System.out.println("is string balance - "+ str5 + " : " + isBalanced(str5));
        System.out.println("is string balance - "+ str6 + " : " + isBalanced(str6));

    }

    public static boolean isBalanced(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') && (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
