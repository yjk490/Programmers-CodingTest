class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int numbersLength = numbers.length;
        
        if (numbersLength > 100) {
        	return answer;
        }
        
        for (double element : numbers) {
        	if (element < 0 || element > 1000) {
        		return answer;
        	}
        	
        	sum += element;
        }
        answer = (double) sum/numbersLength;

        return answer;
    }
}