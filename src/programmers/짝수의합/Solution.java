package programmers.짝수의합;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        while(n > 0){
            if(n % 2 == 0)
                count = count + n;
            n = n - 1;
        }
        answer = count;
        return answer;
    }
}
