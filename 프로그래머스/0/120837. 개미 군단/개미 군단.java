class Solution {
    public int solution(int hp) {
        int answer = 0, i=5;
        while(true) {
            answer += hp/i;
            hp %= i;
            i -= 2;
            if(i==0 || hp==0)
                break;
        }
        return answer;
    }
}