class Solution {
    public String solution(String n_str) {
        int i=0;
        while(true) {
            if(n_str.charAt(i) != '0') {
                System.out.println(i+", "+n_str.charAt(i));
                return n_str.substring(i);
            }
            i++;
        }
    }
}