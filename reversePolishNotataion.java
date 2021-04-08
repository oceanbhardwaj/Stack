class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> s=new Stack<>();
       
        for(int i=0;i<token.length;i++)
        {
            if(token[i].equals("+"))
            {
                int p1=s.pop();
                int p2=s.pop();
                int d=p1+p2;
                s.push(d);
            }
           else if(token[i].equals("-"))
            {
                int p1=s.pop();
                int p2=s.pop();
                int d=p2-p1;
                s.push(d);
            }
           else if(token[i].equals("*"))
            {
                int p1=s.pop();
                int p2=s.pop();
                int d=p1*p2;
                s.push(d);
            }
           else if(token[i].equals("/"))
            {
                int p1=s.pop();
                int p2=s.pop();
                int d=p2/p1;
                s.push(d);
            }
            else
                s.push(Integer.parseInt(token[i]));
            
        }
        return s.peek();
        
        
    }
}