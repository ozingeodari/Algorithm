class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean first = true;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                first = true;
            } else {
                if (first) {
                    answer += Character.toUpperCase(s.charAt(i));
                    first = false;
                } else {
                    answer += Character.toLowerCase(s.charAt(i));
                }
            }
        }
        
        return answer;
    }
}