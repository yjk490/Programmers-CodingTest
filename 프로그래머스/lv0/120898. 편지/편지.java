class Solution {
    public int solution(String message) {
        int messageLength = message.length();
        
        if (messageLength < 1 || messageLength > 50) {
            return 0;
        }
        
        return messageLength*2;
    }
}