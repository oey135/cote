class Solution {
    public int solution(int a, int b) {
        int f = Integer.parseInt(a+""+b);
        int s = 2*a*b;
        return f > s ? f : f == s ? f : s;
    }
}