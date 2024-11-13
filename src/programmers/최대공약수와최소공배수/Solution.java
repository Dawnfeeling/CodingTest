package programmers.최대공약수와최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n, m);
        answer[1] = (m*n) / answer[0];

        return answer;
    }

    public static int getGCD(int n, int m){
        if(n >= m){
            if(n % m == 0){
                return m;
            }
            return getGCD(m, n % m);
        }else{
            if(m % n == 0){
                return n;
            }
            return getGCD(n, m % n);
        }
    }
}