class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length == arr2.length) {
            int[] result = new int[2];
            for(int i=0; i<arr1.length; i++) {
                result[0] += arr1[i];
                result[1] += arr2[i];
            }
            if(result[0] > result[1]) {
                return 1;
            } else if(result[0] < result[1]) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return arr1.length > arr2.length ? 1 : -1;
        }
    }
}