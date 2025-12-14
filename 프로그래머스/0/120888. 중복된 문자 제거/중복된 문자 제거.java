import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        ArrayList<Character> alpha = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            if(alpha.contains(my_string.charAt(i))==false)
                alpha.add(my_string.charAt(i));
            else continue;
        }
        
        StringBuilder sb = new StringBuilder();
        for(Character c : alpha) sb.append(c);
        
        answer = sb.toString();
        System.out.println(answer);
        
        return answer;
    }
}