import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        for (int i=0; i<cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if (list.contains(city)) {
                answer++;
                list.remove(city);
                list.addLast(city);
            } else {
                answer += 5;
                
                if (cacheSize == 0) {
                    continue;
                }
                
                if (cacheSize == list.size()) {
                    list.removeFirst();
                }
                
                list.addLast(city);
            }
        }
        
        return answer;
    }
}