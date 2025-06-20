package Stacks;

import java.util.Stack;

public class DailyTemperatures {
    public int[] validTemperatures(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevIndex  = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }
}
