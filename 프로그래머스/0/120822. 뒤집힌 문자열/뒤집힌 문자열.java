class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i=my_string.length()-1; i>-1; i--)
            answer += arr[i];

        
        return answer;
    }
}