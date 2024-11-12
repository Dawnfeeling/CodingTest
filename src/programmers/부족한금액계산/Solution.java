package programmers.부족한금액계산;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i<=count; i++) {
            answer = answer + price * i;
        }
        if(answer > money) {
            return answer - money;
        }else{
            return 0;
        }
    }
}
