class Solution {
    public int[] solution(long n) {
        String num = n + "";
        int[] answer = new int[num.length()];
        
        for (int i=0; i<num.length(); i++) {
            answer[i] = num.charAt(num.length() - i - 1) - '0';
        }
        
        return answer;
    }
}