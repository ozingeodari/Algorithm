class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        for (int i=0; i<X.length(); i++) {
            char c = X.charAt(i);
            countX[c - '0']++;
        }
        
        int[] countY = new int[10];
        for (int i=0; i<Y.length(); i++) {
            char c = Y.charAt(i);
            countY[c - '0']++;
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i=9; i>=0; i--) {
            int count = countX[i] > countY[i] ? countY[i] : countX[i];
            for (int j=0; j<count; j++) {
                answer.append(i);
            }
        }
        
        if (answer.isEmpty()) {
            return "-1";
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}