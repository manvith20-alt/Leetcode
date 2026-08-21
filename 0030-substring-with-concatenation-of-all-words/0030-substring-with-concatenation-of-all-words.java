class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen)
            return result;

        HashMap<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (int start = 0; start < wordLen; start++) {

            int left = start;
            int count = 0;

            HashMap<String, Integer> windowMap = new HashMap<>();

            for (int right = start; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (!wordMap.containsKey(word)) {
                    windowMap.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                count++;

                while (windowMap.get(word) > wordMap.get(word)) {

                    String leftWord = s.substring(left, left + wordLen);

                    windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }

                if (count == wordCount) {
                    result.add(left);

                    String leftWord = s.substring(left, left + wordLen);

                    windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }
            }
        }

        return result;
    }
}