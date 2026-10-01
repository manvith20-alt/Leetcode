class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans=0;
        int fst=0;
        int sec=0;
        for(String ch : tokens){
            int sum=0;
            if (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")) {
                stack.push(Integer.parseInt(ch));
          }
          else{
               if(ch.equals("+")){
                sec=stack.pop();
                fst=stack.pop();
                sum = fst+sec;
                stack.push(sum);
               }
               else if(ch.equals("-")){
                sec=stack.pop();
                fst=stack.pop();
                sum = fst-sec;
                stack.push(sum);
               }
               else if(ch.equals("*")){
                sec=stack.pop();
                fst=stack.pop();
                sum = fst*sec;
                stack.push(sum);
               }
               else {
                sec=stack.pop();
                fst=stack.pop();
                sum = fst/sec;
                stack.push(sum);
               }
          }
        }
        ans = stack.pop();
        return ans;
    }
}