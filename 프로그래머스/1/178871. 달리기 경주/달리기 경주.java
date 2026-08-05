import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String player : callings) {
            int i = map.get(player);
            
            String temp = players[i - 1];
            players[i - 1] = players[i];
            players[i] = temp;
            
            map.put(player, i - 1);
            map.put(temp, i);
        }
        
        return players;
    }
}