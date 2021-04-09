class Solution {
    public int calculate(String s) {
        Stack<Integer>s1=new Stack<>();
        int num=0;
        char last='+';
        if(s.length()==0)
            return 0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            num=num*10+ch-'0';
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || i==s.length()-1)
            {
                if(last=='+')
                    s1.push(num);
                else if(last=='-')
                    s1.push(-1*num);
                else if(last=='*')
                    s1.push(num*s1.pop());
                else if(last=='/')
                    s1.push(s1.pop()/num);
                
                num=0;
                last=ch;
                
            }
            
            
        }
        int sum=0;
        while(!s1.isEmpty())
            sum=sum+s1.pop();
        
        
        return sum;
        
    }
}