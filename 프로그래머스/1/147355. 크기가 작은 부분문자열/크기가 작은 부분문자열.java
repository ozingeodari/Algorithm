class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        long pp = Long.parseLong(p);
        for (int i=0; i<=t.length()-len; i++) {
            String s = t.substring(i, i+len);
            long ss = Long.parseLong(s);
            if (ss <= pp) {
                answer++;
            }
        }
        
        return answer;
    }
}