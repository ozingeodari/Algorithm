import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a, b, c, d};
        Arrays.sort(num);
        
        if (num[0] == num[3]) {
            return 1111 * num[0];
        }
        
        if (num[0] == num[2]) {
            return (10 * num[0] + num[3]) * (10 * num[0] + num[3]);
        }
        if (num[1] == num[3]) {
            return (10 * num[1] + num[0]) * (10 * num[1] + num[0]);
        }
        
        if (num[0] == num[1] && num[2] == num[3]) {
            return (num[0] + num[2]) * (num[2] - num[0]);
        }
        
        if (num[0] == num[1]) {
            return num[2] * num[3];
        }
        if (num[1] == num[2]) {
            return num[0] * num[3];
        }
        if (num[2] == num[3]) {
            return num[0] * num[1];
        }
        
        return num[0];
    }
}