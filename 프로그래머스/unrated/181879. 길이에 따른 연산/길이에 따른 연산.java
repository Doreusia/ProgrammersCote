class Solution {
    public int solution(int[] num_list) {
        int result = num_list.length >= 11 ? 0 : 1;
        if (num_list.length >= 11) {
            for (int n : num_list) {
                result += n;
            }
        } else {
            for (int n : num_list) {
                result *= n;
            }
        }
        return result;
    }
}