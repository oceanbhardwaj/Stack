class Solution {
    public int findTheWinner(int n, int k) {
        // if(n==1)
        //     return 1;
        // return (findTheWinner(n-1,k)+k-1)%n+1;
        
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
            a.add(i);
        
        return dfs(a,0, k);
        
        
    }
    public int dfs(ArrayList<Integer> a,int i,int k)
    {
        if(a.size()==1)
            return a.get(0);
        int d=(i+k-1)%a.size();
        System.out.println(a.get(d));
        a.remove(d);
        return dfs(a,d,k);
    }
}