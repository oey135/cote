class Solution {
    public boolean solution(int x) {
        int len = (x+"").length();
        int div = 0;
        int ox = x;
        for(int i=0; i<len; i++) {
            div += x%10;
            x/=10;
        }
        System.out.println(x+" "+div);
        return ox%div==0 ? true : false;
    }
}