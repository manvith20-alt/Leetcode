class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[s.length()];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }
            else if(ch == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    remove[i] = true;
                }
            }
        }

        while(!stack.isEmpty()){
            remove[stack.pop()] = true;
        }

        StringBuilder str = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!remove[i]){
                str.append(ch);
            }
        }

        return str.toString();
    }
}