class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(0, 0, numbers, target);
        
        return answer;
    }
    
    public void DFS(int index, int sum, int[] numbers, int target) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        DFS(index+1, sum+numbers[index], numbers, target);
        DFS(index+1, sum-numbers[index], numbers, target);
    }
}