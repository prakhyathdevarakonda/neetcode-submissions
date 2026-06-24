class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsCount = new HashSet<>();
        for(int num : nums) {
            if(numsCount.contains(num)) {
                return true;
            }
            numsCount.add(num);
        }
        return false;
    }
}