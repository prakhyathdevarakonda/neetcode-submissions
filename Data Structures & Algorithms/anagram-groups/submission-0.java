class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        

        for(String str : strs) {
            int[] count = new int[26];
            for(char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(str);
        }
        return new ArrayList<>(group.values());
    }
}
