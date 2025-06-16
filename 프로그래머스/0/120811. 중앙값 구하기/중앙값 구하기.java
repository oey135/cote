import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        if(array.length%2==0)
            for(int i=(array.length/2-1); i<array.length/2; i++)
                answer += array[i];
        else
            answer = array[array.length/2];
        return answer;
    }
}