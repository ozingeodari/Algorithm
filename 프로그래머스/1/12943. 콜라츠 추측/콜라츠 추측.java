class Solution {
    public int solution(int num) {
        int answer = 0;
        long ex = num;
        while (answer <= 500) {
            if (ex == 1) {
                break;
            }
            
            if (ex % 2 == 0) {
                ex = ex / 2;
            } else {
                ex = ex * 3 + 1;
            }
            answer++;
        }
        
        if (answer > 500) {
            return -1;
        } 
        
        return answer;
    }
}