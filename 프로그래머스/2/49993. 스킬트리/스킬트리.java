class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i=0; i<skill_trees.length; i++) {
            int count = 0;
            boolean can = true;
            String s = skill_trees[i];
            
            for (int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                
                if (skill.contains(String.valueOf(c))) {
                    if (c == skill.charAt(count)) {
                        count++;
                    } else {
                        can = false;
                        break;
                    }
                }
            }
            
            if (can) {
                answer++;
            }
        }
        
        return answer;
    }
}