class Solution {
    public String smallestSubsequence(String s) {
        int lastIndex[]=new int[26];
        boolean visited[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            lastIndex[s.charAt(i)-'a']=i;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            int d=s.charAt(i)-'a';
            if(visited[d])
                continue;
            while(!stack.isEmpty() && stack.peek()>s.charAt(i) && lastIndex[stack.peek()-'a']>i )
            { visited[stack.peek()-'a']=false;
                stack.pop();
                
            } 
            stack.push(s.charAt(i));
            visited[s.charAt(i)-'a']=true;
            
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}