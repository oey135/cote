class Solution {
    public int solution(int[] num_list) {
        int d = 0;
        int h = 0;
        for(int i=0; i<num_list.length; i++) {
            if(i%2==0) {
                d += num_list[i];
            } else {
                h += num_list[i];
            }
        }
        return Math.max(d,h);
    }
}