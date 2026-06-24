class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length + 1];
		int[] postfix = new int[nums.length + 1];
        int[] result = new int[nums.length];
		int product = 1;
		prefix[0] = 1;
		postfix[nums.length] = 1;
	    for(int i = 1; i< nums.length + 1; i++) {
	        product = product * nums[i-1];
	        prefix[i] = product;
	    }
	    product = 1;
	    for(int i = nums.length - 1; i >= 0; i--) {
	        product = product * nums[i];
	        postfix[i] = product;
	    }
		for(int i = 0; i < nums.length; i++) {
		    result[i] = prefix[i] * postfix[i+1];
		}
        return result;
    }
}  
