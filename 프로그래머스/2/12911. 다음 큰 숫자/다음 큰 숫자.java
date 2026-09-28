class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = Integer.bitCount(n);
        
        while (num != answer) {
            n += 1;
            answer = Integer.bitCount(n);
        }
        
        return n;
    }
}