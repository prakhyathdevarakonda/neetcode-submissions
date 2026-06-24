class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numsMap.containsKey(nums[i])) {
                return true;
            } else {
                numsMap.put(nums[i], 0);
            }
        } 
        return false;
    }
}
