import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] answers2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answers3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] answer = new int[3];
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == answers1[i % 5]) {
                answer[0]++;
            }
            if (answers[i] == answers2[i % 8]) {
                answer[1]++;
            }
            if (answers[i] == answers3[i % 10]) {
                answer[2]++;
            }
        }
        
        int max = Math.max(answer[0],
                          Math.max(answer[1], answer[2]));
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<3; i++) {
            if (max == answer[i]) {
                list.add(i + 1);
            }
        }
        
        int[] aa = new int[list.size()];
        for (int i=0; i<aa.length; i++) {
            aa[i] = list.get(i);
        }
        
        return aa;
    }
}