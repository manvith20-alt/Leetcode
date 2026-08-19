class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int left = 0; left <= s2.length() - s1.length(); left++) {

            HashMap<Character, Integer> window = new HashMap<>();

            for (int right = left; right < left + s1.length(); right++) {
                char ch = s2.charAt(right);
                window.put(ch, window.getOrDefault(ch, 0) + 1);
            }

            if (map.equals(window))
                return true;
        }

        return false;
    }
}