class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++) {
            char ch = code.charAt(i);
            if(mode == 1) {
                if(ch == '1') mode = mode==1 ? 0 : 1; 
                else {
                    if(i%2 == 1) ret += ch;
                }
            } else {
                if(ch == '1') mode = mode==1 ? 0 : 1;
                else { if(i%2==0) ret += ch; }
            }
        }
        
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}