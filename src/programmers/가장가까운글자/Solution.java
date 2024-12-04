package programmers.가장가까운글자;

import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        for(int i = 1; i < s.length(); i++) {
            for(int j = i-1; j >= 0; j--) {
                if(s.charAt(j) == s.charAt(i)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }
}