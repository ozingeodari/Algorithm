class Solution {
    public int solution(String word) {
        String s = "AEIOU";
        
        int[] arr = new int[5];
        arr[4] = 1;
        for (int i=3; i>=0; i--) {
            arr[i] = (arr[i + 1] * 5) + 1;
        }
        
        int answer = 0;
        for (int i=0; i<word.length(); i++) {
            answer += s.indexOf(word.charAt(i)) * arr[i] + 1;
        }
        
        return answer;
    }
}