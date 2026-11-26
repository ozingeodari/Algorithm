import java.util.*;
class Solution {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> cheol = new HashMap<>();
        HashMap<Integer, Integer> dong = new HashMap<>();
        for (int num : topping) {
            cheol.put(num, cheol.getOrDefault(num, 0) + 1);
        }
        
        int answer = 0;
        for (int num : topping) {
            if (cheol.get(num) == 1) {
                cheol.remove(num);
            } else {
                cheol.put(num, cheol.get(num) - 1);
            }
            
            dong.put(num, dong.getOrDefault(num, 0) + 1);
            
            if (cheol.size() == dong.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}