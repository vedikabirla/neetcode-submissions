class MinStack {
  
    private Deque<Integer> stack;
    private Deque<Integer> minimum;

    public MinStack() {
        stack = new ArrayDeque<>();
        minimum = new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        if(minimum.isEmpty()) {
            minimum.push(val);
        } else {
            minimum.push(Math.min(val, minimum.peek()));
        }
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minimum.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minimum.peek();
    }
}
