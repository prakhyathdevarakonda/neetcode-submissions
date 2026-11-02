class Solution {
    public int[] getConcatenation(int[] nums) {
	    int[] concatNums = new int[2 * nums.length];
	    int len = nums.length;
	    for(int i = 0; i < len; i++) {
	        concatNums[i] = nums[i];
	        concatNums[len + i] = nums[i];
	    }
        return concatNums;
    }
}