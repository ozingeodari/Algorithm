import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i=0; i<s.length(); i++) {
            String next = s.substring(i) + s.substring(0, i);
            if (isTrue(next)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean isTrue(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char now = stack.peek();
                if (now == '(' && c == ')') {
                    stack.pop();
                } else if (now == '{' && c == '}') {
                    stack.pop();
                } else if (now == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}