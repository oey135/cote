import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {

        int[] answer = new int[emergency.length];
        int[] sorted = emergency.clone();

        Arrays.sort(sorted);

        for(int i = 0; i < emergency.length; i++) {
            answer[i] = sorted.length - Arrays.binarySearch(sorted, emergency[i]);
        }

        return answer;
    }
}