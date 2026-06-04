class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int bandStreak = bandage[0];
        int bandPerSec = bandage[1];
        int bandBonus = bandage[2];

        int answer = health;
        int attackMax = attacks.length;

        int attackNum = 0;
        int streak = 0;

        for (int time = 1; time <= attacks[attackMax - 1][0]; time++) {
            if (time == attacks[attackNum][0]) {
                answer -= attacks[attackNum][1];
                streak = 0;
                attackNum++;

                if (answer <= 0) {
                    return -1;
                }

                continue;
            }

            answer += bandPerSec;
            if (++streak >= bandStreak) {
                answer += bandBonus;
                streak = 0;
            }

            if (answer > health) {
                answer = health;
            }
        }

        return answer;
    }
}