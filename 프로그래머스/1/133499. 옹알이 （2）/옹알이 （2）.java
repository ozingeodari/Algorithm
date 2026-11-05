class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list = {"aya", "ye", "woo", "ma"};
        
        for (int i=0; i<babbling.length; i++) {
            String s = babbling[i];
            
            boolean seq = false;
            for (int j=0; j<list.length; j++) {
                if (s.contains(list[j] + list[j])) {
                    seq = true;
                    break;
                }
            }
            if (seq) {
                continue;
            }
            
            for (int j=0; j<list.length; j++) {
                s = s.replace(list[j], " ");
            }            
            
            if (s.trim().isEmpty()) {
                answer++;
            }   
        }
        
        return answer;
    }
}