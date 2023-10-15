import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int i = 0;
        while (i != arr.length) {
            if (tmp.size() == 0) {
                tmp.add(arr[i++]);
            } else if (tmp.size() != 0 && tmp.get(tmp.size() - 1) < arr[i]) {
                tmp.add(arr[i++]);
            } else if (tmp.size() != 0 && tmp.get(tmp.size() - 1) >= arr[i]) {
                tmp.remove(tmp.size() - 1);
            }
        }

        int[] stk = tmp.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return stk;
    }
}