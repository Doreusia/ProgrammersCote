import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<String> tmp = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String n = String.valueOf(i);
            int idx = 0;
            for (String s : n.split("")) {
                idx++;
                if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")) {
                    break;
                }
                if (idx == n.length()) {
                    tmp.add(String.valueOf(i));
                }
            }
        }
        
        int[] result = new int[Math.max(tmp.size(), 1)];
        if (tmp.size() != 0) {
            int cnt = 0;
            for (String s : tmp) {
                result[cnt++] = Integer.parseInt(s);
            }
        } else {
            result[0] = -1;
        }

        return result;
    }
}