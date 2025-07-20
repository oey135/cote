class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int b=0, el=0, in=0;
        for(int i=0; i<sides.length; i++) {
            if(sides[i] > b) {
                b = sides[i];
                in = i;
            }
        }
        for(int i=0; i<sides.length; i++) {
            if(i==in)
                continue;
            el += sides[i];
        }
        if(b < el)
            answer -= 1;
        return answer;
    }
}