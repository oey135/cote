import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i].equals("Z")){
                arr[i] = "0";
                arr[i-1] = "0";
            }
        }
        
        for(String n : arr) {
            answer += Integer.parseInt(n);
        }
        
        return answer;
    }
}