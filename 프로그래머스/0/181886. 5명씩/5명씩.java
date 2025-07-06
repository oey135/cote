class Solution {
    public String[] solution(String[] names) {
        int j=0;
        for(int i=0; i<names.length; i++)
            if(i%5==0)
                j++;
        String[] answer = new String [j];
        j=0;
        for(int i=0; i<names.length; i++) {
            if(i%5 == 0) {
                answer[j] = names[i];
                j++;
            }
        }
        return answer;
    }
}