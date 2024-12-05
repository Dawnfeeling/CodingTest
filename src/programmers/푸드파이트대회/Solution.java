package programmers.푸드파이트대회;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=0; i<food.length; i++) {
            if(food[i] % 2 == 0){
                for(int j = 0; j<food[i]/2; j++){
                    answer = answer + i;
                }
            }else {
                for(int j = 0; j<food[i]/2; j++){
                    answer = answer + i;
                }
            }
        }
        answer = answer + 0;
        for(int i=answer.length()-2; i>=0; i--){
            answer = answer + answer.charAt(i);
        }
        return answer;
    }
}
