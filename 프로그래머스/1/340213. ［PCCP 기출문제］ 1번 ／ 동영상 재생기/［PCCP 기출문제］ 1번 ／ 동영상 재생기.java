class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoMax = toSec(video_len);
        int now = toSec(pos);
        int openingStart = toSec(op_start);
        int openingEnd = toSec(op_end);
        
        if (openingStart <= now && now < openingEnd) {
            now = openingEnd;
        }
        
        for (String command : commands) {
            if (command.equals("next")) {
                now += 10;
                if (now > videoMax) {
                    now = videoMax;
                }
            } else {
                now -= 10;
                if (now < 0) {
                    now = 0;
                }
            }
            
            if (openingStart <= now && now < openingEnd) {
                now = openingEnd;
            }
        }
        
        int mm = now / 60;
        int ss = now % 60;
        
        return String.format("%02d:%02d", mm, ss);
    }
    
    public int toSec(String time) {
        int mm = Integer.parseInt(time.substring(0, 2));
        int ss = Integer.parseInt(time.substring(3, 5));
        return mm * 60 + ss;
    }
}