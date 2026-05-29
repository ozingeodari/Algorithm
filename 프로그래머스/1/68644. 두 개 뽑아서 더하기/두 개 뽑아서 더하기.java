import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> plus = new ArrayList<>();
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                if (!plus.contains(numbers[i] + numbers[j])) {
                    plus.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        int[] answer = new int[plus.size()];
        for (int i=0; i<plus.size(); i++) {
            answer[i] = plus.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}