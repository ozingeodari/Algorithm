class Solution {
    public int[] solution(String s) {
        int[] result = new int[2];
        
        while (!s.equals("1")) {
            int count = 0;
            
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '0') {
                    count++;
                }
            }
            result[1] += count;
            
            int length = s.length() - count;
            s = Integer.toBinaryString(length);
            result[0]++;
        }
        
        return result;
    }
}