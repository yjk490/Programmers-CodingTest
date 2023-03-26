class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (Math.abs(num1) > 50000 || Math.abs(num2) > 50000) {
            return answer;
        } else {
            answer = num1 - num2;
        }
        
        return answer;
    }
}