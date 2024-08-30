package NeetCode150_ProblemSolving;

import java.util.*;

public class MinStack0155 {
    class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public MinStack() {
            this.stack = new Stack<>();
            this.minStack = new Stack<>();
        }

        public void push(int val) {
            this.stack.push(val);
            int minVal = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
            this.minStack.push(minVal);
        }

        public void pop() {
            this.stack.pop();
            this.minStack.pop();
        }

        public int top() {
            return this.stack.peek();
        }

        public int getMin() {
            return this.minStack.peek();
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}