import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        
        int[] answer = new int[prices.length];
        for (int i=0; i<prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int time = stack.pop();
                answer[time] = i - time;
            }
            
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int time = stack.pop();
            answer[time] = prices.length - time - 1;
        }
        
        return answer;
    }
}