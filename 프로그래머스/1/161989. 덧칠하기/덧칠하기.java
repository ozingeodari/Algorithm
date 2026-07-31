class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
   
        int count =0 ;
        for (int i=0; i<section.length; i++) {
            if (count <= n && count <= section[i]) {
                count = section[i] + m;
                answer++;
            }
        }
        
        return answer;
    }
}