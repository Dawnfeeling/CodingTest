package programmers.약수의개수와덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            //제곱근이 정수이면 약수 개수는 홀수, 제곱근이 정수가 아니면 약수 개수는 짝수
            if(Math.sqrt(i) % 1 == 0){
                answer = answer - i;
            }else{
                answer = answer + i;
            }
        }
        return answer;
    }
}