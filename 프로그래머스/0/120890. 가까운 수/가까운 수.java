import java.math.*;

class Solution {
    public int solution(int[] array, int n) {
        
        int[] temp = new int[array.length];
        
        for(int i=0; i<array.length; i++) {
            temp[i] = Math.abs(array[i]-n);
        }
        
        int answer=0, min=101;
        for(int i=0; i<array.length; i++) {
            if(temp[i] < min) {
                min = temp[i];
                answer = array[i];
            }
            else if(temp[i] == min) {
                answer = array[i] < answer ? array[i] : answer;
            }
        }
        return answer;
    }
}