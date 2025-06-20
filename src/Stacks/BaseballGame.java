package Stacks;
import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations){
        Stack<Integer> stack = new Stack<>();

        for(String op : operations){
            switch (op) {
                case "C" -> stack.pop();
                case "D" -> stack.push(2 * stack.peek());
                case "+" -> {
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);
                    stack.push(last + secondLast);
                }
                default -> stack.push(Integer.parseInt(op));
            }
        }

        int score = 0;

        for(int sum : stack){
            score += sum;
        }
        return score;
    }
}
