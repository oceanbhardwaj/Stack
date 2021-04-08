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
/////////////////////////////////////////////
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s;
    Stack<Integer> min;
    public MinStack() {
        s=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || min.peek()>=val)
            min.push(val);
        
    }
    
    public void pop() {
       int d= s.pop();
        if(d==min.peek())
            min.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
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
/////////////////////////////////////////////
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s;
     int min=Integer.MAX_VALUE;
    public MinStack() {
        s=new Stack<>();
        
    }
    
    public void push(int val) {
        if(min>=val)
        { s.push(min);
      min=val;}
        s.push(val);
        
    }
    
    public void pop() {
       if(min==s.pop())
           min=s.pop();
           
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
       
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
///////////////////////////////////////////////////////////
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s;
    int min=Integer.MAX_VALUE;
    //push-->2v-m;
    //pop-->2*min(val)-(2v-m)=m
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty() )
        { min=val;
         s.push(val);
        }
        else if( min<=val)
            s.push(val);
        else if(min>val)
        { 
           s.push(val+(val-min)); 
            min=val;
            
            
        }
        
        
    }
    
    public void pop() {
        
        if(s.isEmpty())
            return ;
        int value=s.pop();
       if(value<min)
       { int d=min;
           min=2*d-value;
       }
        
            
        
    }
    
    public int top() {
        if(s.isEmpty())
            return -1;
        if(s.peek()>=min)
        return s.peek();
        else
            return min;
        
    }
    
    public int getMin() {
        if(s.isEmpty())
            return -1;
        else
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