package programmers.이상한문자만들기;

class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for(char c : s.toCharArray()){
            if(index % 2 == 0){
                if(Character.isLowerCase(c)){
                    answer = answer + Character.toUpperCase(c);
                } else if (Character.isUpperCase(c)) {
                    answer = answer + c;
                }else{
                    answer = answer + " ";
                    index = -1;
                }
            }else{
                if(Character.isUpperCase(c)){
                    answer = answer + Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    answer = answer + c;
                }else {
                    answer = answer + " ";
                    index = -1;
                }
            }
            index++;
        }
        return answer;
    }
}