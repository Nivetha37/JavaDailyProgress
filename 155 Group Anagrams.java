/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26]; // Frequency array for letters a-z

            for (char c : s.toCharArray()) {
                count[c - 'a']++; // Increment the count of each character
            }

            String key = Arrays.toString(count); // Convert frequency array to string as a key

            // Check if key exists, if not create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s); // Add the string to the correct list
        }

        return new ArrayList<>(map.values());
    }
}
