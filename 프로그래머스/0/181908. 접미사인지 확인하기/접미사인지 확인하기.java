import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] arr = new String[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++) {
            arr[i] = my_string.substring(i);
        }
        if(Arrays.asList(arr).contains(is_suffix)) {
            return 1;
        } else return 0;
    }
}