class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int startIdx = query[0];
            int endIdx = query[1];
            for (int i = startIdx; i <= endIdx; i++) {
                if (i % query[2] == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}