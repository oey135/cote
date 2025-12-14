import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String morse = ".-:a,-...:b,-.-.:c,-..:d,.:e,..-.:f,--.:g,....:h,..:i,.---:j,-.-:k,.-..:l,--:m,-.:n,---:o,.--.:p,--.-:q,.-.:r,...:s,-:t,..-:u,...-:v,.--:w,-..-:x,-.--:y,--..:z";
        HashMap<String, String> mos = new HashMap<>();
        String[] k = morse.split(",");
        
        for(String key : k) {
            String[] keyValue = key.split(":");
            
            if(keyValue.length == 2) {
                String rk = keyValue[0];
                String rv = keyValue[1];
                mos.put(rk, rv);
            }
        }
        
        String[] str = letter.split(" ");
        for(String s : str) {
            answer += mos.get(s);
        }
        
        return answer;
    }
}