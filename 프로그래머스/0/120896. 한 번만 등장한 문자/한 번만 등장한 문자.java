import java.util.*;

class Solution {
    public String solution(String s) {
        
        Map<Character,Integer> countMap = new TreeMap<>();
        char[] string = s.toCharArray();
        for(char ch : string) {
            countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
        }
        
        int countMin=1001;
        for(int c : countMap.values()) {
            countMin = Math.min(countMin, c);
        }
        
        int minCount=0;
        String answer = "";
        for(Map.Entry<Character,Integer> entry : countMap.entrySet()) {
            if(countMin == entry.getValue()) {
                minCount++;
                if(minCount>=1) {
                    answer += entry.getKey();
                }
            }
        }
        
        return answer;
    }
}