import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<Character, Integer> map = new HashMap<>();
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (char c : type) {
            map.put(c, 0);
        }
        
        for (int i=0; i<survey.length; i++) {
            char one = survey[i].charAt(0);
            char two = survey[i].charAt(1);
            
            int choice = choices[i];
            if (choice >= 1 || choice <= 3) {
                map.put(one, map.get(one) + (4 - choice));
            } else if (choice >= 5 || choice <= 7) {
                map.put(two, map.get(two) + (choice - 4));
            }
        }
        
        answer += (map.get('R') >= map.get('T') ? 'R' : 'T');
        answer += (map.get('C') >= map.get('F') ? 'C' : 'F');
        answer += (map.get('J') >= map.get('M') ? 'J' : 'M');
        answer += (map.get('A') >= map.get('N') ? 'A' : 'N');
        
        return answer;
    }
}