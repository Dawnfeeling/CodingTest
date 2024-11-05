package programmers.없는숫자더하기;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int number : numbers) {
                if (number == i) {
                    count++;
                }
            }
            if (count == 0) {
                answer = answer + i;
            }
        }
        return answer;
    }
}
