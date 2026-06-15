class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int num = number.length;
        
        for (int i=0; i<num; i++) {
            for (int j=i+1; j<num; j++) {
                for (int k=j+1; k<num; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
        
        
    }
}