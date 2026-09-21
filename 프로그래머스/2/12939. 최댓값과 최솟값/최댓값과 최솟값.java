class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String n : num) {
            int a = Integer.parseInt(n);
            if (a < min) {
                min = a;
            } 
            if (a > max) {
                max = a;
            }
        }
        
        return min + " " + max;
    }
}