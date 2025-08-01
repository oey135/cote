import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] an = answer.toCharArray();
        Arrays.sort(an);
        answer = String.valueOf(an);
        return answer;
    }
}