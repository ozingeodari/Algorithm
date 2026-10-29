class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=0; i<n; i++) {
            answer++;
            
            while (answer % 3 == 0 || three(answer)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean three(int answer) {
        while (answer > 0) {
            if (answer % 10 == 3) {
                return true;
            }
            
            answer /= 10;
        }
        
        return false;
    }
}