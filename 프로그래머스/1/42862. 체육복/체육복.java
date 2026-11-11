import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] training = new int[n + 2];
        Arrays.fill(training, 1);
        
        for (int i=0; i<lost.length; i++) {
            training[lost[i]]--;
        }
        for (int i=0; i<reserve.length; i++) {
            training[reserve[i]]++;
        }
        
        for (int i=1; i<=n; i++) {
            if (training[i] == 0) {
                if (training[i - 1] == 2) {
                    training[i - 1]--;
                    training[i]++;
                } else if (training[i + 1] == 2) {
                    training[i + 1]--;
                    training[i]++;
                }
            }
        }
        
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (training[i] > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}