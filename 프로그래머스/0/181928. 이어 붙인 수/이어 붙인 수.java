class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String s = "";
        String m = "";
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 1) {
                s += num_list[i];
            } else {
                m += num_list[i];
            }
        }
        return Integer.parseInt(s)+Integer.parseInt(m);
    }
}