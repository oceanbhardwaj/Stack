class CustomStack {
    int top=-1;
    int max;
    int a[];
    public CustomStack(int maxSize) {
        max=maxSize;
        a=new int[max];
        
    }
    
    public void push(int x) {
        if(top<max-1)
        {
            top++;
            a[top]=x;
        }
        
    }
    
    public int pop() {
        if(top<=-1)
            return -1;
        else
        {
            int t=a[top];
            top--;
            return t;
        }
        
        
    }
    
    public void increment(int k, int val) {
        int min=Math.min(k-1,top);
        for(int i=0;i<=min;i++)
        {
            a[i]=a[i]+val;
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