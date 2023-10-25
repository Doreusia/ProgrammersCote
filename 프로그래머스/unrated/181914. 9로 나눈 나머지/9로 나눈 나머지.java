import java.util.*;

class Solution {
    public int solution(String number) {
        int[] intArr = number.chars() // 문자열을 IntStream으로 변환
                .map(Character::getNumericValue) // 문자를 숫자로 매핑
                .toArray();

        int sum = Arrays.stream(intArr).sum();
        return sum % 9;
    }
}