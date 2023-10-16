import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {
        int result = Arrays.stream(num_list)
                .anyMatch(num -> n == num) ? 1 : 0;

        return result;
    }
}