class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++) {
            int num = array[i];
            while(num > 0) {
                int temp = num % 10;
                num /= 10;
                if(temp == 7) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}