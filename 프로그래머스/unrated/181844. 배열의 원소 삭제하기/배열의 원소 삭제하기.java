import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] result = Arrays.stream(arr)
                .filter(element -> Arrays.stream(delete_list).noneMatch(e -> e == element))
                .toArray();

        return result;
    }
}