class Solution {
    public boolean isNumber(String s) {
        if(s.contains("Infinity") || s.equals("NaN") || s.contains("f") || s.contains("D"))
            return false;
        try{
            Float.parseFloat(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}