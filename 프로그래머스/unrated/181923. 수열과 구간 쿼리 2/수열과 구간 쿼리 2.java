class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int minVal = Integer.MAX_VALUE;
            for (int i = query[0]; i <= query[1]; i++) {
                if (arr[i] > query[2] && minVal > arr[i]) {
                    minVal = arr[i];
                }
            }
            result[idx++] = minVal == Integer.MAX_VALUE ? -1 : minVal;
        }
        return result;
    }
}