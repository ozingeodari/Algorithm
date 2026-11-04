class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list = {"aya", "ye", "woo", "ma"};
        
        for (String s : babbling) {
            for (String word : list) {
                s = s.replace(word, " ");
                if (s.trim().isEmpty()) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}