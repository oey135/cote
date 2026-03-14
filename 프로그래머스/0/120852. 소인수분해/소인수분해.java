import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int i=2;
        while(i <= n) {
            if(n%i==0) {
                n/=i;
                if(!list.contains(i)) {
                    list.add(i);
                }
            }
            else {
                i++;
            }
        }
        int[] answer = list.stream().mapToInt(j -> j).toArray();
        return answer;
    }
}