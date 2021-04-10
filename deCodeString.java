class Solution {
    public String decodeString(String s) {
        Stack<Integer> c=new Stack<>();
        Stack<String> result=new Stack<>();
        String res="";
        int count=0;
        for(int i=0;i<s.length();)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                count=0;
                while(Character.isDigit(s.charAt(i)))
                {
                    count=count*10+s.charAt(i)-'0';
                    i++;
                }
                c.push(count);
            }
            else if(s.charAt(i)=='[')
            {
                result.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder sb=new StringBuilder(result.pop());
                int c1=c.pop();
                for(int j=0;j<c1;j++)
                {
                    sb.append(res);
                }
                res=sb.toString();
                
                i++;
            }
            else
            {
                res+=s.charAt(i);
                i++;
            }
        }
        return res;
        
    }
}