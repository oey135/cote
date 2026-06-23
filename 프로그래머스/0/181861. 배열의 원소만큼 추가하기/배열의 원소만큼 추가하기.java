class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for(int i : arr) {
            size += i;
        }
        int[] answer = new int[size];
        int index = 0;
        for(int i : arr) {
            for(int j=0; j<i; j++) {
                answer[index] = i;
                index++;
            }
         }
        
        return answer;
    }
}