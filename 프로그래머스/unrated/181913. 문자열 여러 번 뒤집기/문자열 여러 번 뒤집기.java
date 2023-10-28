class Solution {
    public String solution(String my_string, int[][] queries) {
        String result = my_string;
        StringBuffer buffer1 = new StringBuffer(my_string);
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < queries.length; i++) {
            buffer.append(result.substring(queries[i][0], queries[i][1] + 1)).reverse();
            buffer1.replace(queries[i][0], queries[i][1] + 1, buffer.toString());
            result = buffer1.toString();
            buffer.setLength(0);
        }

        return result;
    }
}