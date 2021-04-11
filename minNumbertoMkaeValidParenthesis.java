class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            if(!s.isEmpty() && s.peek()=='(' && S.charAt(i)==')')
                s.pop();
           else
                s.push(S.charAt(i));
        }
        return s.isEmpty()?0:s.size();
        
    }
}
/////////////////////////////////////////o(1)
class Solution {
    public int minAddToMakeValid(String S) {
       int left=0;
        int right=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
                right++;
            else if(right>0)
                right--;
            else
                left++;
        }
        return left+right;
    }
}