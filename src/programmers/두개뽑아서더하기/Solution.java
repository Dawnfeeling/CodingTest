package programmers.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answer2 = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(!answer2.contains(numbers[i] + numbers[j])) {
                    answer2.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(answer2);
        int[] answer = answer2.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
