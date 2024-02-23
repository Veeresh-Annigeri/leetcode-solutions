class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Increment frequency for characters in string s
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Decrement frequency for characters in string t
        for (char c : t.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) - 1);

            // If the count becomes negative, the strings are not anagrams
            if (frequencyMap.get(c) < 0) {
                return false;
            }
        }

        // Check if all counts are zero
        for (int count : frequencyMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}