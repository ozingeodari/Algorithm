import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> name = new HashMap<>();
        
        for (int i=0; i<record.length; i++) {
            String[] s = record[i].split(" ");
            
            if (s[0].equals("Enter") || s[0].equals("Change")) {
                name.put(s[1], s[2]);
            }
        }
        
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<record.length; i++) {
            String[] s = record[i].split(" ");
            
            if (s[0].equals("Enter")) {
                list.add(name.get(s[1]) + "님이 들어왔습니다.");
            } else if (s[0].equals("Leave")) {
                list.add(name.get(s[1]) + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}