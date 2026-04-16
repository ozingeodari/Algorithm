class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        
        while (n >= a) {
            int change = n / a;
            int newCola = change * b;
            
            result += newCola;
            n = n % a + newCola;
        }
        
        return result;
    }
}