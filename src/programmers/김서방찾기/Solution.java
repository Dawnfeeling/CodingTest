package programmers.김서방찾기;

import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (String kim : seoul) {
            if (kim.equals("Kim")) {
                answer = "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
            }
        }
        return answer;
    }
}
