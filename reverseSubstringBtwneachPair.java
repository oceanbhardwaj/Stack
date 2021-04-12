class Solution {
    public String reverseParentheses(String s) {
        Stack<String> s1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!s1.isEmpty() && s.charAt(i)==')')
            { StringBuilder sb=new StringBuilder();
                while(!s1.isEmpty() && !s1.peek().equals("("))
                {
                    StringBuilder sb1=new StringBuilder(s1.peek());
                    sb1.reverse();
                    sb.append(sb1.toString());
                    s1.pop();
                    
                    
                }
             //sb.reverse();
             s1.pop();
             s1.push(sb.toString());
            }
            else
                s1.push(s.charAt(i)+"");
        }
        StringBuilder sb2=new StringBuilder();
        while(!s1.isEmpty())
        {
            sb2.insert(0,s1.pop());
        }
        return sb2.toString();
        
    }
}