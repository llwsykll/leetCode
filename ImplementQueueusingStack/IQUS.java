class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2 = new Stack<>();
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();      
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int top = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return top;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int top = s2.pop();
        s2.push(top);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return top;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */