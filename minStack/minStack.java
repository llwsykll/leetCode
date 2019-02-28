class MinStack {
    private List<Integer> s;

    /** initialize your data structure here. */
    public MinStack() {
        s = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        s.add(x);
    }
    
    public void pop() {
        s.remove(s.size()-1);
    }
    
    public int top() {
        return s.get(s.size()-1);
    }
    
    public int getMin() {
        int minn = s.get(0);
        for(int i=1;i<s.size();i++){
            minn = Math.min(minn,s.get(i));
        }
        return minn;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */