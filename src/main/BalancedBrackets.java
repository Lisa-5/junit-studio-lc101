package main;


import java.util.ArrayList;
import java.util.Stack;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     * <p>
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     * <p>
     * The string may contain non-bracket characters as well.
     * <p>
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     * <p>
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {

//        ArrayList<String> bracketString = new ArrayList<>();
//        Stack<Character> stack = new Stack<>();
//        for (char ch : str.toCharArray()) {
//
//            if (ch == '[') {
//                stack.push(ch);
//            } else if (ch == ']') {
//                if (stack.isEmpty() || stack.pop() != '['){
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();

                    int brackets = 0;
            for (char ch : str.toCharArray()) {
                if (ch == '[') {
                    brackets++;
                } else if (ch == ']') {
                    brackets--;
                        if(brackets == -1){
                            return false;
                        }
                }
            }
            return brackets == 0;
    }
}

