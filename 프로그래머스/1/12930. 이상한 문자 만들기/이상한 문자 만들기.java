class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        int count = 0;
        for (String ss : arr) {
            if (ss.equals(" ")) {
                count = 0;
            } else {
                count++;
            }

            if (count % 2 == 0) {
                answer += ss.toLowerCase();
            } else {
                answer += ss.toUpperCase();
            }
        }
        
        return answer;
    }
}