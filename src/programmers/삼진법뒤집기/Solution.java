package programmers.삼진법뒤집기;

import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        while(n != 0){
            stack.add(n % 3);
            n = n / 3;
        }
        int size = stack.size();
        for(int i = 0; i < size; i++){
            answer = (int) (answer + (stack.pop() * Math.pow(3,i)));
        }
        return answer;
    }
}
