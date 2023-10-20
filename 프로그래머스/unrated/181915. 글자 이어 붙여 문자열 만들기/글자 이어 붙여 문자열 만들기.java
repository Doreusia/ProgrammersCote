import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String result = Arrays.stream(index_list)
                .mapToObj(i -> my_string.charAt(i))
                .map(Object::toString)
                .collect(Collectors.joining());

        return result;
    }
}