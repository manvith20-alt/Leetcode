class Solution {
    public void reverseString(char[] s) {
      int i=0;
      int j=s.length-1;

       int left=0;
       int right=s.length-1;
       while(left<right){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
       }
    }
}