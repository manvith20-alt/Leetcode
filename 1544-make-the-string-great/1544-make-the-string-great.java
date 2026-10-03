class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && (stack.peek()==(char)(ch-32) || (stack.peek()==(char)ch+32))){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        for(char ch : stack){
            str.append(ch);
        }
        return str.toString();
    }
}