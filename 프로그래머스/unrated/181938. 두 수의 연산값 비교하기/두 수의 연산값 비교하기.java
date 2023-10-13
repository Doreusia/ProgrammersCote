class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int aab = 2 * a * b;
        
        return ab >= aab ? ab : aab;
    }
}