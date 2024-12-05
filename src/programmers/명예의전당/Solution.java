package programmers.명예의전당;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(result.size() < k) {
                result.add(score[i]);
                Collections.sort(result);
            }else{
                if(score[i] > result.get(0)){
                    result.remove(0);
                    result.add(score[i]);
                    Collections.sort(result);
                }
            }
            answer[i] = result.get(0);
        }
        return answer;
    }
}
