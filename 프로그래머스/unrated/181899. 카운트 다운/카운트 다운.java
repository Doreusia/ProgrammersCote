import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] result = new int[start - end_num + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = start--;
        }
        return result;
    }
}