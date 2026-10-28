import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> list = new LinkedList<>();
        
        int length = progresses.length;
        int index = 0;
        while (index < length) {
            for (int i=index; i<length; i++) {
                progresses[i] += speeds[i];
            }
            
            int num = 0;
            while (index < length && progresses[index] >= 100) {
                num++;
                index++;
            }
            
            if (num > 0) {
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}