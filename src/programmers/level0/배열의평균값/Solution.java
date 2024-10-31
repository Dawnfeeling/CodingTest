package programmers.level0.배열의평균값;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int i=0;
        for(i=0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        answer = (sum * 1.0) / numbers.length;
        return answer;
    }
}
