class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];

        int idx = 0;
        if (k % 2 == 0) {
            for (int i : arr) {
                result[idx] = arr[idx++] + k;
            }
        } else {
            for (int i : arr) {
                result[idx] = arr[idx++] * k;
            }
        }
        return result;
    }
}