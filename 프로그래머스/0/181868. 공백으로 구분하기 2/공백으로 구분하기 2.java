import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) != ' ') {
                str += my_string.charAt(i);
            } else if(!str.equals("")) {
                list.add(str);
                str = "";
            }
        }
        if(!str.equals("")) list.add(str);
        return list.toArray(String[] :: new);
    }
}