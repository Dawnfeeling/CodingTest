package programmers.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (b >= a) {
            for (long i = a; i <= b; i++) {
                answer = answer + i;
            }
        } else {
            for (long i = b; i <= a; i++) {
                answer = answer + i;
            }
        }
        return answer;
    }
}
