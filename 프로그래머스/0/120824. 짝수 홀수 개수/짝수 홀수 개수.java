class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        int i=0;
      while(i < num_list.length) {
          if(num_list[i]%2==0)
              answer[0] ++;
          else
              answer[1] ++;
          i++;
      }  
        return answer;
    }
}