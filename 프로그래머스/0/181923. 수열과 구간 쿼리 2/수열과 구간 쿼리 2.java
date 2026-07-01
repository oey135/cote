class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            int s = 1000001;
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                if(queries[i][2] < arr[j] && s > arr[j]) {
                    s = arr[j];
                    System.out.println(s);
                }
            }
            answer[i] = (s != 1000001 ? s : -1);
        }
        return answer;
    }
}