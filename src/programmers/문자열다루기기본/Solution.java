package programmers.문자열다루기기본;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6){
            answer = false;
        }
        for(char c : s.toCharArray()){
            if((int)c <48 || (int)c > 58){
                answer = false;
                break;
            }
        }
        return answer;
    }
}