class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int formed = 0;

        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (need.containsKey(ch)) {

                window.put(ch, window.getOrDefault(ch, 0) + 1);

                if (window.get(ch).equals(need.get(ch))) {
                    formed++;
                }
            }

            while (formed == need.size()) {

                // Current window is valid
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);

                if (need.containsKey(leftChar)) {

                    window.put(leftChar, window.get(leftChar) - 1);

                    if (window.get(leftChar) < need.get(leftChar)) {
                        formed--;
                    }
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(minLeft, minLeft + minLen);
    }
}