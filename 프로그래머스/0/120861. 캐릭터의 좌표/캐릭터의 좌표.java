class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(int i=0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "up":
                    if(Math.abs(answer[1]+1) > board[1]/2) break;
                    else answer[1]++; break;
                case "down":
                    if(Math.abs(answer[1]-1) > board[1]/2) break;
                    else answer[1]--; break;
                case "left":
                    if(Math.abs(answer[0]-1) > board[0]/2) break;
                    else answer[0]--; break;
                case "right": 
                    if(Math.abs(answer[0]+1) > board[0]/2) break;
                    else answer[0]++; break;
            }
            System.out.println(answer[0]+" "+answer[1]);
        }
      
        
        
        return answer;
    }
}