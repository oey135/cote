import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int j=0;
        for(int i=0; i<my_string.length(); i++) {
            if('0'<=my_string.charAt(i) && my_string.charAt(i)<='9')
                j++;
        }
        int[] answer = new int [j]; j=0;
        for(int i=0; i<my_string.length(); i++) {
            if('0'<=my_string.charAt(i) && my_string.charAt(i)<='9') {
                answer[j] = (int)my_string.charAt(i)-48;
                j++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}