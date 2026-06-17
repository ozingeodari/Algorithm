class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] weapons = new int[number + 1];
        
        for (int i=1; i<=number; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    weapons[i]++;
                }
            }
            
            if (weapons[i] > limit) {
                answer += power;
            } else {
                answer += weapons[i];
            }
        }
        
        return answer;
    }
}