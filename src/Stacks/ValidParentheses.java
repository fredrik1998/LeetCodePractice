package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }

                char end = stack.pop();

                if(ch == ')' && end == '(' ||
                   ch == '}' && end == '}' ||
                   ch == ']' && end == '['
                  ) return false;
            }
        }
        return stack.isEmpty();
    }
}
