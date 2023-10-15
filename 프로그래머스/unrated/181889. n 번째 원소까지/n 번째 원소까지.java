import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = IntStream.range(0, n)
                .map(i -> num_list[i])
                .toArray();
        return result;
    }
}