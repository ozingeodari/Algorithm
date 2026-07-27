import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        for (int height=3; height<=Math.sqrt(sum); height++) {
            if (sum % height == 0) {
                int width = sum / height;
                if (height * 2 + width * 2 - 4 == brown) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        
        return answer;
    }
}