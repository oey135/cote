class Solution {
    public int[] solution(int n) {
        int an=0;
        if(n%2==0)
            an = n/2;
        else
            an = n/2+1;
        int[] answer = new int[an];
        an=-1;
        for(int i=1; i<=n; i++) {
            if(i%2==0)
                continue;
            answer[++an] = i;
        }
        return answer;
    }
}