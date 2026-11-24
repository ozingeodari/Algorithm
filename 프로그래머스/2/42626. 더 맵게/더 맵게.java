import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i=0; i<scoville.length; i++) {
            queue.add(scoville[i]);
        }
        
        int answer = 0;
        while (queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }
            
            int one = queue.poll();
            int two = queue.poll();
            int newFood = one + two * 2;
            
            queue.add(newFood);
            answer++;
        }
        
        return answer;
    }
}