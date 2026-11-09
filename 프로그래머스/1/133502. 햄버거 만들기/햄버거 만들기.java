import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<ingredient.length; i++) {
            stack.push(ingredient[i]);
            
            int len = stack.size();
            if (len >= 4) {
                if (stack.get(len - 1) == 1 &&
                    stack.get(len - 2) == 3 &&
                    stack.get(len - 3) == 2 &&
                    stack.get(len - 4) == 1) {
                    for (int j=0; j<4; j++) {
                        stack.pop();
                    }
                    
                    answer++;
                }
            }
        }
    
        return answer;
    }
}