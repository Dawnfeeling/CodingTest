package programmers.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int length = Long.toString(n).length();
        answer = new int[length];
        for(int i = 0; i < length; i++){
            answer[i] = (int)(n % 10);
            n = n / 10;
        }
        return answer;
    }
}
