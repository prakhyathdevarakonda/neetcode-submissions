class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int length = cleanString.length() - 1;
        for(int i = 0, j = length; i < j; i++, j-- ) {
            if(cleanString.charAt(i) != cleanString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
