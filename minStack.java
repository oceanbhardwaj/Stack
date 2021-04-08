class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s;
    public MinStack() {
        s=new Stack<>();
        
    }
    
    public void push(int val) {
        s.push(val);
        
    }
    
    public void pop() {
        s.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        ArrayList<Integer> a=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        while(!s.isEmpty())
        {
            a.add(s.peek());
            min=Math.min(s.peek(),min);
            s.pop();
            
        }
       // int d=a.indexOf(min);
        //a.remove(d);
        for(int i=a.size()-1;i>=0;i--)
        {
            s.push(a.get(i));
        }
        
        return min;
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