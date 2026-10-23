import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)(right - left + 1);

        int[] answer = new int[length];
        for (int i=0; i<length; i++) {
            long col = (left + i) % n;
            long row = (left + i) / n;
            
            answer[i] = (int)(Math.max(col + 1, row + 1));
        }
        
        return answer;
    }
}