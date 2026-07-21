class Solution {
    public int[] solution(int l, int r) {
        int index = 0;
        
        for(int i=l; i<=r; i++) {
            String str = String.valueOf(i);
            int len = 0;
            
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                
                if(ch == '5' || ch=='0') {
                    len++;
                }
            }
            if(len == str.length()) {
                index++;
            }
        }
        if(index==0) {
            int[] arr = {-1};
            return arr;
        }
        int[] arr = new int[index];
        index=0;
        
        
        for(int i=l; i<=r; i++) {
            String str = String.valueOf(i);
            int len = 0;
            
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                
                if(ch == '5' || ch=='0') {
                    len++;
                }
            }
            if(len == str.length()) {
                arr[index++] = i;
            }
        }
        
        return arr;
    }
}