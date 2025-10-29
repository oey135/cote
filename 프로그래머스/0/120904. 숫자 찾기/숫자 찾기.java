class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a = Integer.toString(num);
        String b = Integer.toString(k);
        
        System.out.println(a);
        answer = a.indexOf(b) != -1 ? a.indexOf(b)+1 : -1;
        
        
        return answer;
    }
}