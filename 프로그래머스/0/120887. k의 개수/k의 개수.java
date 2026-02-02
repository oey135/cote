class Solution {
    public int solution(int i, int j, int k) {
        
        int answer = 0;
        String check = Integer.toString(k);
        
        for(int n=i; n<=j; n++) {
            String[] arr = String.valueOf(n).split("");;
            
            for(int c=0; c < arr.length; c++) {
                if(arr[c].equals(check)) answer++;
            }
        }
        
        
        
        return answer;
    }
}