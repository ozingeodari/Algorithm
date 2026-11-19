class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i=0; i<schedules.length; i++) {
            int limit = calculateTime(schedules[i]);
            
            boolean good = true;
            for (int j=0; j<7; j++) {
                int day = (startday + j - 1) % 7 + 1;
                if (day == 6 || day == 7) {
                    continue;
                }
                
                if (limit < timelogs[i][j]) {
                    good = false;
                    break;
                }
            }
            
            if (good) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static int calculateTime(int time) {
        int h = time / 100;
        int m = time % 100 + 10;
        
        if (m >= 60) {
            h++;
            m -= 60;
        }
        
        return h * 100 + m;
    }
}