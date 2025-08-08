class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length]; int f=0;
        if(direction.startsWith("r")==true) {
            f = numbers[numbers.length-1];
            for(int i=0; i<numbers.length-1; i++) {
                answer[i+1] = numbers[i];
            }
            answer[0] = f;
        }
        else {
            f = numbers[0];
            for(int i=0; i<numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = f;
        }
        return answer;
    }
}