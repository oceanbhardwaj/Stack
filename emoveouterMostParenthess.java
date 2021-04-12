class Solution {
    public String removeOuterParentheses(String S) {
        //count opened parenthesis
        int open=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(' && open++>0)
                sb.append(S.charAt(i));
            if(S.charAt(i)==')' && open-->1)
                sb.append(S.charAt(i));
        }
        return sb.toString();
        
    }
}