package Stacks;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(a, b, token);
                stack.push(result);
            } else {
                stack.pop();
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token){
        return "+-*/".contains(token);
    }

    private int applyOperator(int a, int b, String operator){
        switch (operator){
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a- b;
            }

            case "*" -> {
                return a * b;
            }

            case "/" -> {
                return a / b;
            }
            default -> throw new IllegalArgumentException("Not valid operator: " + operator);
        }
    }
}
