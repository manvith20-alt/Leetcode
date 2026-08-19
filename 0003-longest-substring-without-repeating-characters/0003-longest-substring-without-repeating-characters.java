class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left=0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int right=0;right<s.length();right++){
            while(map.containsKey(s.charAt(right))){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0)
                    map.remove(s.charAt(left));
                left++;
            }
                map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}