class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a+""+b);
        int bb = Integer.parseInt(b+""+a);
        
        return ab > bb ? ab : bb;
    }
}