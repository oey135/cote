class Solution {
    public int solution(int[] sides) {
        int c=0;
        
        if(sides[0] < sides[1]) {
            int temp = sides[0];
            sides[0] = sides[1];
            sides[1] = temp;
        }
        for(int i = sides[0]-sides[1]+1; i < sides[0]+sides[1]; i++) {
            c++;
        }
        
        return c;
    }
}