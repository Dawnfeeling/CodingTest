package programmers.x만큼간격이있는n개의숫자;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1] + x;
        }

        return answer;
    }
}
