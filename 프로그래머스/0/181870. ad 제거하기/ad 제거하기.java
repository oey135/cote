class Solution {
    public String[] solution(String[] strArr) {
        int len = 0;
        for(int i=0; i<strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                len++;
            }
        }
        String[] str = new String[len];
        int idx = 0;
        for(int i=0; i<strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                str[idx++] = strArr[i];
            }
        }
        return str;
    }
}