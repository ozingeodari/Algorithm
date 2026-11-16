import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> subCon = new Stack<>();
        
        int now = 1;
        for(int i=0; i<order.length; i++) {
            while (now < order[i]) {
                subCon.add(now);
                now++;
            }
            
            if (now == order[i]) {
                answer++;
                now++;
            } else if (!subCon.isEmpty() && subCon.peek() == order[i]) {
                subCon.pop();
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}