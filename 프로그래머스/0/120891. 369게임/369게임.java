class Solution {
    public int solution(int order) {
        int answer = 0;
        String a = Integer.toString(order);
        
        for(int i=0; i<a.length(); i++) {
            switch(a.charAt(i)) {
                case '3' : case '6' : case '9' :
                    answer++;
                default: continue;
            }
        }
        
        return answer;
    }
}