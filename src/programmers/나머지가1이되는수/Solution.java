package programmers.나머지가1이되는수;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
