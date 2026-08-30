import java.util.*;
class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        System.out.println(a+b);
        if(str[1].equals("+")) {
            return a + b;
        } else if(str[1].equals("-")) {
            return a - b;
        } else {
            return a * b;
        }
    }
}