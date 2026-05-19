import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        int i=0;
        while (i < d.length) {
            if (d[i] > budget) {
                break;
            }
            budget -= d[i];
            i++;
            answer++;
        }
        
        return answer;
    }
}