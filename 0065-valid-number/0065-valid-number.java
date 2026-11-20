class Solution {
    public boolean isNumber(String s) {

        s = s.trim();

        if(s.length() == 0) return false;

        int i = 0;

        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            i++;
        }

        boolean digit = false;

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            digit = true;
            i++;
        }

        if(i < s.length() && s.charAt(i) == '.') {
            i++;

            while(i < s.length() && Character.isDigit(s.charAt(i))) {
                digit = true;
                i++;
            }
        }

        if(!digit) return false;

        if(i < s.length() && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;

            if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                i++;
            }

            boolean expDigit = false;

            while(i < s.length() && Character.isDigit(s.charAt(i))) {
                expDigit = true;
                i++;
            }

            if(!expDigit) return false;
        }

        return i == s.length();
    }
}