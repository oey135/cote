import java.util.*;
import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (o1, o2) -> {
            return o1[0]-o2[0];
        });
        System.out.println((dots[2][0]-dots[0][0])+" "+(dots[1][1]-dots[0][1]));
        System.out.println(dots[2][0]+" - "+dots[0][0]+"\n"+dots[1][1]+" - "+dots[0][1]);
        int answer = Math.abs(dots[2][0]-dots[0][0])*Math.abs(dots[1][1]-dots[0][1]);
        
        return answer;
    }
}