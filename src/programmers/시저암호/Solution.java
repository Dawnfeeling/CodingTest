package programmers.시저암호;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' '){
                answer = answer + c;
            }else{
                answer = answer + asc(c, n);
            }
        }
        return answer;
    }

    public char asc(char c, int n) {
        char temp;
            if((int)c >= 65 && (int)c <= 90){
                if((int)c + n > 90){
                    int m = n - (91 - (int)c);
                    temp = (char)(65 + m);
                }else{
                    temp = (char)((int)c + n);
                }
            }else{
                if((int)c + n > 122){
                    int m = n - (123 - (int)c);
                    temp = (char)(97 + m);
                }else{
                    temp = (char)((int)c + n);
                }
            }
        return temp;
    }
}