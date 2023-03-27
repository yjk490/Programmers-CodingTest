class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n <= 0 || n > 1000) {
        	return answer;
        }
        
        for (int val = 0 ; val <= n ; val+=2) {
        	answer += val;
        }
        
        return answer;
    }
}