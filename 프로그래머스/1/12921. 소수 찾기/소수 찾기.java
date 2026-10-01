class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] sosus = new int[n+1];
        
        for (int i=2; i<n+1; i++) {
            if (sosu(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean sosu(int num) {
        for (int i=2; i*i<=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}