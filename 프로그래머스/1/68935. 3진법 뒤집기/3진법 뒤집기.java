class Solution {
    public int solution(int n) {
        String num = "";
        
        while (n > 0) {
            int three = n % 3;
            num += three;
    
            n /= 3;
        }
        
        return Integer.parseInt(num, 3);
    }
}