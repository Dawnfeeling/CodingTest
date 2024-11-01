package programmers.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int temp = 0;
        for(int num : arr){
            temp =  temp + num;
        }
        answer = temp / (double)arr.length;
        return answer;
    }
}
