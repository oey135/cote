class Solution {
    public double solution(int a, int b, int c) {
        int ab = a==b ? 1 : 0;
        int ac = a==c ? 1 : 0;
        int bc = b==c ? 1 : 0;
        int sum = ab+ac+bc;

        if(sum == 0) {
            return a+b+c;
        } else if(sum == 1) {
            return (a + b + c) * (a*a + b*b + c*c);
        } else {
            return  (a + b + c) * (a*a + b*a + c*c) * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        }
    }
}