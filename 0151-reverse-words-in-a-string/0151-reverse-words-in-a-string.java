class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.trim().split("\\s+");
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            sb.append(arr[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
        
    }
}