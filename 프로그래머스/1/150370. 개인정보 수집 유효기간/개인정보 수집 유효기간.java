import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<terms.length; i++) {
            String[] s = terms[i].split(" ");
            map.put(s[0].charAt(0), Integer.parseInt(s[1]));
        }
        
        int todayYear = Integer.parseInt(today.substring(0, 4));
        int todayMonth = Integer.parseInt(today.substring(5, 7));
        int todayDay = Integer.parseInt(today.substring(8, 10));
        int days = (todayYear * 12 * 28) + (todayMonth * 28) + todayDay;
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<privacies.length; i++) {
            int pYear = Integer.parseInt(privacies[i].substring(0, 4));
            int pMonth = Integer.parseInt(privacies[i].substring(5, 7));
            int pDay = Integer.parseInt(privacies[i].substring(8, 10));
            int pdays = (pYear * 12 * 28) + (pMonth * 28) + pDay;
            
            int term = map.get(privacies[i].charAt(11));
            int tdays = term * 28;
            
            int dd = pdays + tdays;
            if (dd <= days) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}