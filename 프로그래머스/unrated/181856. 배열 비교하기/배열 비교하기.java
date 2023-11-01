import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int result = 0;
        if (arr1.length > arr2.length) {
            result = 1;
        } else if (arr1.length < arr2.length){
            result = -1;
        } else {
            if (arr1.length == arr2.length) {
                result = Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum() ? 0 : -1;
            }
        }
        return result;
    }
}