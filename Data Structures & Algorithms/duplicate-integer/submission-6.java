class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupCheck = new HashSet<>();
        for(int n : nums) {
            if(dupCheck.contains(n)) {
                return true;
            }
            dupCheck.add(n);
        }
        return false;
    }
}