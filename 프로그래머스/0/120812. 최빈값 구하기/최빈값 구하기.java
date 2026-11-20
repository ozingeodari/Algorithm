class Solution {
    public int solution(int[] array) {
        int[] num = new int[1001];
        int max = 0;
        for(int i=0; i<array.length; i++) {
            num[array[i]]++;
            if (max < num[array[i]]) {
                max = num[array[i]];
            }
        }
        
        int answer = 0;
        boolean check = false;
        for (int i=0; i<num.length; i++) {
            if (num[i] == max) {
                if (check) {
                    return -1;
                }
                
                answer = i;
                check = true;
            }
        }
        
        return answer;
    }
}