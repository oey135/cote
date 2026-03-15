class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] en = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        
        for(int i=0; i<en.length; i++) {
            numbers = numbers.replaceAll(en[i], Integer.toString(i));
        }
        answer = Long.valueOf(numbers);
        
        return answer;
    }
}