import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        List<String> game = new ArrayList<>();
        
        game.add(words[0]);
        
        for (int i=1; i<words.length; i++) {
            String previous = words[i-1];
            String now = words[i];
            
            if (previous.charAt(previous.length() - 1) != now.charAt(0) || 
                game.contains(now) || 
                now.length() < 1) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            
            game.add(now);
        }
        
        return answer;
    }
}