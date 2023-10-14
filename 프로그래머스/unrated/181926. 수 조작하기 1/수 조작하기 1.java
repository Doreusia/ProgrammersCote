class Solution {
    public int solution(int n, String control) {
        for (String s : control.split("")) {
            if (s.equals("w")) {
                n = n + 1;
            } else if (s.equals("s")) {
                n = n - 1;
            } else if (s.equals("d")) {
                n = n + 10;
            } else if (s.equals("a")) {
                n = n - 10;
            }
        }
        return n;
    }
}