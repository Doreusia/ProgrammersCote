class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int startIdx = query[0];
            int endIdx = query[1];
            int minVal = Integer.MAX_VALUE;
            for (int i = startIdx; i <= endIdx; i++) {
                if (arr[i] > query[2] && minVal > arr[i]) {
                    minVal = arr[i];
                }
            }
            result[idx++] = minVal == Integer.MAX_VALUE ? -1 : minVal;
        }
        return result;
    }
}