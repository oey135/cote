class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<n; i++) {
            answer++;
            while(answer%3==0 || answer%10==3 || (answer/10)%10==3) {
                // 3의 배수 || 일의 자리가 3 || 십의 자리가 3
                answer++;
            }
            System.out.println(answer);
        }
        return answer;
    }
}