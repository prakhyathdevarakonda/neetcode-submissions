class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] dup = new int[2 * length];
        int i = 0;
        for(i = 0; i < length; i++) {
            dup[i] = nums[i];
            dup[i + length] = nums[i];
        }
        // for(int j = 0; i < dup.length; j++, i++) {
        //     dup[i] = nums[j];
        // }
        return dup;
    }
}