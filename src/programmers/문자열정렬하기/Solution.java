package programmers.문자열정렬하기;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new CustomComparator(n));
        return strings;
    }

    static class CustomComparator implements Comparator<String>{
        private int n;

        public CustomComparator(int n){
            this.n = n;
        }
        @Override
        public int compare(String a, String b) {
            if(a.charAt(n) == b.charAt(n)){
                return a.compareTo(b);
            }
            return Character.compare(a.charAt(n), b.charAt(n));
        }
    }
}
