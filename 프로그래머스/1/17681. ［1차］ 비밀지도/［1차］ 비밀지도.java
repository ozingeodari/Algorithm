class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++) {
            String str1 = binaryString(arr1[i], n);
            String str2 = binaryString(arr2[i], n);
            
            String str = "";
            
            for (int j=0; j<n; j++) {
                if (str1.charAt(j) == '0' && str2.charAt(j) == '0') {
                    str += " ";
                } else {
                    str += "#";
                }
            }
            
            answer[i] = str;
        }
        
        return answer;
    }
    
    public String binaryString(int num, int n) {
        String str = Integer.toBinaryString(num);
        
        while (str.length() < n) {
            str = "0" + str;
        }
        
        return str;
    }
}