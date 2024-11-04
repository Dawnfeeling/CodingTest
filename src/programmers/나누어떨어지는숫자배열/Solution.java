package programmers.나누어떨어지는숫자배열;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            list.sort(Integer::compare);
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}
