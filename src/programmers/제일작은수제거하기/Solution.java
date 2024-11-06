package programmers.제일작은수제거하기;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int temp = 0;
        if(arr.length == 1){
            answer  = new int[1];
            answer[0] = -1;
        }else{
            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
            }
            answer = new int[arr.length - 1];
            for (int j : arr) {
                if (j != min) {
                    answer[temp++] = j;
                }
            }
        }
        return answer;
    }
}

