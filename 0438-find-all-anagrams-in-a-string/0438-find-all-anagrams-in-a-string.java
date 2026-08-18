class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     int n1=s.length();
     int n2=p.length();
     ArrayList<Integer> array = new ArrayList<>();
     
     int[] pcount = new int[26];
     for(char c: p.toCharArray()){
        pcount[c-'a']++;
     }

     for(int i=0;i<=n1-n2;i++){
        int[] scount = new int[26];

        for(int k=i;k<i+n2;k++){
            scount[s.charAt(k)-'a']++;
        }

        if(Arrays.equals(scount,pcount))
            array.add(i);
     }
     
     return array; 
    }
}