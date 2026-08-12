import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10;
        int right = 12;
        
        for (int i : numbers) {
            if (i == 0) {
                i = 11;
            }
            
            if (i == 1 || i == 4 || i == 7) {
                answer += "L";
                left = i;
            } else if (i == 3 || i == 6 || i == 9) {
                answer += "R";
                right = i;
            } else {
                int lDis = getDistance(left, i);
                int rDis = getDistance(right, i);
                
                if (lDis < rDis) {
                    answer += "L";
                    left = i;
                } else if (lDis > rDis) {
                    answer += "R";
                    right = i;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        left = i;
                    } else {
                        answer += "R";
                        right = i;
                    }
                }
            }
        }
        
        return answer;
    }
    
    private int getDistance(int finger, int num) {
        int posC = (finger - 1) % 3;
        int posR = (finger - 1) / 3;
        
        if (finger == 10) {
            posC = 0;
            posR = 3;
        }
        if (finger == 11) {
            posC = 1;
            posR = 3;
        }
        if (finger == 12) {
            posC = 2;
            posR = 3;
        }
        
        int numC = (num - 1) % 3;
        int numR = (num - 1) / 3;
        
        if (num == 11) {
            numC = 1;
            numR = 3;
        }
        
        return Math.abs(posR - numR) + Math.abs(posC - numC);
    }
}