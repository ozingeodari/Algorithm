import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<keymap.length; i++) {
            for (int j=0; j<keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                
                if (!map.containsKey(c) || map.get(c) > j + 1) {
                    map.put(c, j + 1);
                }
            }
        }
        
        int[] answer = new int[targets.length];
        for (int i=0; i<targets.length; i++) {
            for (int j=0; j<targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                
                if (!map.containsKey(c)) {
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += map.get(c);
            }
        }
        
        return answer;
    }
}