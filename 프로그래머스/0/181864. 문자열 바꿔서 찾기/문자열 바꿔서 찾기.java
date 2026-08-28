import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        pat = pat.replaceAll("B", "C").replaceAll("A", "B").replaceAll("C", "A");
        return myString.indexOf(pat) != -1 ? 1 : 0;
    }
}