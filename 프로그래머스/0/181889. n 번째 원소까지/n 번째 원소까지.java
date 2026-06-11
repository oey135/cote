class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = num_list[i];
        }
        return arr;
    }
}