class Solution {
    public String[] solution(String my_string) {
        int length = my_string.split(" ").length;
        String[] result = new String[length];
        int idx = 0;
        for (String s : my_string.split(" ")) {
            result[idx++] = s;
        }
        return result;
    }
}