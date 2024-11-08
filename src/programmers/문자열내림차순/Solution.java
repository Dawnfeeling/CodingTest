package programmers.문자열내림차순;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder(Arrays.toString(charArray)).reverse();

        answer = sb.toString();

        return answer;
    }
}
