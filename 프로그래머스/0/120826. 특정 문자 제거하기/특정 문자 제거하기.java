class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(char i=0; i<my_string.length(); i++) {
                if(my_string.charAt(i)==letter.charAt(0))
                    continue;
                answer += my_string.charAt(i);
        }
            return answer;
    }
}