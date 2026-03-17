class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int a = Integer.valueOf(temp[0]);
            int b = Integer.valueOf(temp[2]);
            int result=0;
            
            switch(temp[1]) {
                case "+": result = a+b; break;
                case "-": result = a-b; break;
                default: break;
            }
            if(result == Integer.valueOf(temp[4])) {
                answer[i] = "O";
            }
            else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}