import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> species = new HashSet<>();
        
        for (int num : nums) {
            species.add(num);
        }
        
        int choice = nums.length / 2;
        return Math.min(species.size(), choice);
    }
}