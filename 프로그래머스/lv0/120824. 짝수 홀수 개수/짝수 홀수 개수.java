class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        
        for (int value : num_list) {
            result[value%2]++;
        }
        
        return result;
    }
}