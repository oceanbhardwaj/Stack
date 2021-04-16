class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            int d=num.charAt(i)-'0';
            while(!s.isEmpty() && s.peek()>d && k>0)
            {
                
                s.pop();
                k--;
            }
            if(!s.isEmpty() || d!=0)
            s.push(d);
            
            
        }
        
        while(k>0 && !s.isEmpty())
        {
            k--;
            s.pop();
        }
        if(s.isEmpty())
            return "0";
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            
            sb.append(s.pop());
        }
         
        sb.reverse();
        String ss=sb.toString();
        
        return ss;
        
        
        
    }
}