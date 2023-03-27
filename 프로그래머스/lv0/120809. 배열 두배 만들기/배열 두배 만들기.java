import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
//         int[] answer = new int[numbers.length];
        
//         if (numbers.length > 1000) {
//             return answer;
//         }
        
// 	    for (int i=0 ; i < numbers.length ; i++) {
// 	    	if (Math.abs(numbers[i]) > 10000) {
// 	        		return answer;
// 	        	}
	        	
// 	    	answer[i] = numbers[i]*2;
// 	    }
        
//         return answer;
         return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}