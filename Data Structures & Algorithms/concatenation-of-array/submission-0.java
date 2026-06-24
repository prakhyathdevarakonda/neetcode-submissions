class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        int i = 0, j = 0;
        for(i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for(j = 0; j < nums.length; j++, i++) {
            arr[i] = nums[j];
        }
        return arr;
    }
}