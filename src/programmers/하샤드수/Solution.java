package programmers.하샤드수;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int a=0;
        while(temp>0){
            a = a + (temp%10);
            temp = temp/10;
        }
        if (x%a == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
