import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] list = s.split("\\},\\{");
        
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        int[] result = new int[list.length];
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<list.length; i++) {
            String[] now = list[i].split(",");
            for (int j=0; j<now.length; j++) {
                int num = Integer.parseInt(now[j]);
                if (!set.contains(num)) {
                    result[i] = num;
                    set.add(num);
                }
            }
        }
        
        return result;
    }
}