class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int xCount = 0;
        int oCount = 0;
        
        char x = ' ';
        
        for (int i=0; i<s.length(); i++) {
            if (xCount == 0 && oCount == 0) {
                x = s.charAt(i); 
            }
            
            char o = s.charAt(i);
            if (x == o) {
                xCount++;
            } else {
                oCount++;
            }
            
            if (xCount == oCount) {
                answer++;
                xCount = 0;
                oCount = 0;
            }
        }
        
        if (xCount != 0 || oCount != 0) {
            answer++;
        }
        
        return answer;
    }
}