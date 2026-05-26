class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        if (len == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[len - 1];
        
        int min = arr[0];
        for (int i=0; i<len; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        int cnt = 0;
        for (int i=0; i<len; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[cnt++] = arr[i];
        }
        return answer;
    }
}