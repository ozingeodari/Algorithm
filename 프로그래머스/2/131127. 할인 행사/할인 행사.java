import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        
        if (match(wantMap, map)) {
            answer++;
        }
        
        for (int i=10; i<discount.length; i++) {
            String s = discount[i - 10];
            map.put(s, map.get(s) - 1);
            
            String t = discount[i];
            map.put(t, map.getOrDefault(t, 0) + 1);
            
            if (match(wantMap, map)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean match(Map<String, Integer> one, Map<String, Integer> two) {
        for (String s : one.keySet()) {
            if (!two.containsKey(s) || two.get(s) < one.get(s)) {
                return false;
            }
        }
        return true;
    }
}