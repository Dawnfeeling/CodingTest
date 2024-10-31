package programmers.level0.정수내림차순배치;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String strarray = Long.toString(n);
        int[] intarray = new int[strarray.length()];
        for(int i=0; i<strarray.length(); i++) {
            intarray[i] = strarray.charAt(i) - '0';
        }
        //버블정렬
        for(int i = 1; i< intarray.length; i++) {
            for(int j = 0; j< intarray.length-1; j++) {
                if(intarray[j] < intarray[j+1]){
                    int temp = intarray[j+1];
                    intarray[j+1] = intarray[j];
                    intarray[j] = temp;
                }
            }
        }

        int length = intarray.length;
        for(int i=0; i< intarray.length; i++) {
            answer += intarray[i] * (long) Math.pow(10, length-1);
            length-=1;
        }
        return answer;
    }
}
