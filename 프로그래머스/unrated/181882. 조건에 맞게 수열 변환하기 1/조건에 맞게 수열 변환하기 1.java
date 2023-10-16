import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] result = Arrays.stream(arr)
                .map(n -> n >= 50 && n % 2 == 0 ? n / 2 : n < 50 && n % 2 == 1 ? n * 2 : n)
                .toArray();

        return result;
    }
}