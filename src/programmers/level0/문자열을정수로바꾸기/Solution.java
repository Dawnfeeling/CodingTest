package programmers.level0.문자열을정수로바꾸기;

class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '+'){
            s = s.substring(1);
            answer = Integer.parseInt(s);
        }else if(s.charAt(0) == '-'){
            s = s.substring(1);
            answer = Integer.parseInt(s) * -1;
        }else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}
