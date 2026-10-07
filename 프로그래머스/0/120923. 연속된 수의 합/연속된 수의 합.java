class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        
        int middle = total / num;
        int first;
        if (num % 2 == 0) {
            first = middle - (num / 2) + 1;
        } else {
            first = middle - (num / 2);
        }
        
        for (int i=0; i<num; i++) {
            result[i] = first;
            first++;
        }
        
        return result;
    }
}