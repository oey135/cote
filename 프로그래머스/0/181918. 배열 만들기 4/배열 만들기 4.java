import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            int idx = stk.size()-1;
            if(stk.size() == 0) {
                stk.add(arr[i]);
            } else if(stk.get(idx) < arr[i] ) {
                stk.add(arr[i]);
            } else {
                stk.remove(idx);
                i -= 1;
            }
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}