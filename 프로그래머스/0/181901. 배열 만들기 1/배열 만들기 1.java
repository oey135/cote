import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = k;
        while(num <= n) {
            list.add(num);
            num+=k;
        }
        
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}