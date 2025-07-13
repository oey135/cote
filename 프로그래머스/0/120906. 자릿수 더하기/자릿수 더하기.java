class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true) {
            answer += n%10;
            n = n/10;
            System.out.println(n+","+answer);
            if(n==0)
                break;
        }
        return answer;
    }
}