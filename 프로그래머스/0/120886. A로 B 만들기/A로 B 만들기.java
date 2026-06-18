import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int[] sum = new int[2];
        for(int i=0; i<before.length(); i++ ) {
            sum[0] += (int)(before.charAt(i));
            sum[1] += (int)(after.charAt(i));
        }
        if(sum[0] == sum[1]) {
            return 1;
        } else {
            return 0;
        }
    }

}