class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++) {
            int i1 = queries[i][0];
            int i2 = queries[i][1];
            
            int temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
        }
        return arr;
    }
}