import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        //gb
        for (String str : strs) {
            // Initialize an array to count the occurrences of each character in the string
            int[] count = new int[26];
            // Count occurrences of each character in the current string
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            // Convert the count array to a string representation
            StringBuilder sb = new StringBuilder();
            for (int c : count) {
                sb.append('#'); // Use a delimiter to separate counts of different characters
                sb.append(c);
            }
            String key = sb.toString();
            // If the map doesn't contain the key, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add the current string to the list of anagrams corresponding to the key
            map.get(key).add(str);
        }
        
        // Convert the map values to a list and return
        return new ArrayList<>(map.values());
    }
}
