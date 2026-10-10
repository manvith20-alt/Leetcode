class CustomStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(stack1.size() < maxSize){
            stack1.push(x);
        }
    }
    
    public int pop() {
        if(stack1.isEmpty()){
            return -1;
        }
        return stack1.pop();
    }
    
    public void increment(int k, int val) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while(!stack2.isEmpty()){
            if(k>0){
                stack1.push(stack2.pop()+val);
                k--;
            }
            else{
                stack1.push(stack2.pop());
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */