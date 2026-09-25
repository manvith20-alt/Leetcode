class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            boolean alive = true;
            while (alive && !stack.isEmpty()
                    && stack.peek() > 0 && ast < 0) {
                if (stack.peek() < -ast) {
                    stack.pop();
                }
                else if (stack.peek() == -ast) {
                    stack.pop();
                    alive = false;
                }
                else {
                    alive = false;
                }
            }
            if (alive) {
                stack.push(ast);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.get(i);
        }
        return ans;
    }
}