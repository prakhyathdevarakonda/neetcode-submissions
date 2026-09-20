class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        int i= 0;
    

        // for(int i = 0; i < n; i++) {
        //     arr[i] = nums[i];
        //     arr[i+n] = nums[i];
        // }
        // return arr;
        for( i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        for(int j = 0; j < n; j++, i++) {
            arr[i] = nums[j];
        }
        return arr;
    }
}