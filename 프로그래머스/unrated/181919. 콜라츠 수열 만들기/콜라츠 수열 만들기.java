import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> tmp = new ArrayList<>();
        while (n != 1) {
            if (n % 2 != 0) {
                tmp.add(n);
                n = 3 * n + 1;
            } else {
                tmp.add(n);
                n /= 2;
            }
        }
        tmp.add(1);

        int[] result = tmp.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return result;
    }
}