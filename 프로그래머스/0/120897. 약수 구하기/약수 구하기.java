class Solution {
    public int[] solution(int n) {
        int c=0;
        for(int i=1; i<=n; i++) {
            if(n%i==0)
                c++;
        }
        int[] answer = new int [c];
        c=0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                answer[c] = i;
                c++;
            }
        }
        return answer;
    }
}