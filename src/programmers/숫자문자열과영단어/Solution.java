package programmers.숫자문자열과영단어;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for(int i = 0; i < words.length; i++) {
            s = s.replace(words[i], nums[i]);
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}
