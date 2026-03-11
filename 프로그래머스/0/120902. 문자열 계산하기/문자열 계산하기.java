class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.valueOf(str[0]);
        
        
        for(int i=1; i<str.length; i+=2) {
            int next = Integer.valueOf(str[i+1]);
            
            if(str[i].equals("+")) {
                answer += next;
            }
            else if(str[i].equals("-")) {
                answer -= next;
            }
            
        }
        
        return answer;
    }
}