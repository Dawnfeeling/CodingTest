package programmers.level0.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer = answer + (n % 10);
            n = n / 10;
        }
        return answer;
    }
}
