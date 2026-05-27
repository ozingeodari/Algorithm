class Solution {
    public String solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int daySum = 0;
        for (int i=1; i<=a; i++) {
            if (a == i) {
                daySum += b;
                break;
            }
            daySum += month[i-1];
        }
        String answer = days[daySum % 7];
        
        return answer;
    }
}