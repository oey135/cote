import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        before.toLowerCase();
        after.toLowerCase();
        
        char bArray [] = before.toCharArray();
        char aArray [] = after.toCharArray();
        
        Arrays.sort(bArray);
        Arrays.sort(aArray);
        
        String b = String.valueOf(bArray);
        String a = String.valueOf(aArray);
        
        
        answer = a.equals(b) ? 1 : 0 ;
        
        
        return answer;

    }

}