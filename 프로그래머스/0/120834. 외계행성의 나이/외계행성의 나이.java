class Solution {
    public String solution(int age) {
        String answer = "";
        char[] al = new char[26];
        for(int i=0; i<26; i++) {
            al[i] = (char)('a'+i);
        }
        int i=10;
        while(true) {
            answer = al[(age % i)] + answer;
            if(age/i!=0) {
                age /= i;
            }
            else {
                break;
            }
        }
        return answer;
    }
}