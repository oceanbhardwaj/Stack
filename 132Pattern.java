class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]<nums[k] && nums[k]<nums[j])
                        return true;
                }
            }
        }
        return false;
    }
}
////////////////////////
class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        Stack<Integer> s=new Stack<>();
        int min[]=new int[n];
        int min1=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min1=Math.min(nums[i],min1);
            min[i]=min1;
            
        }
            
       
        for(int i=n-1;i>=0;i--)
        {
            
             int mid=nums[i];
             if(!s.isEmpty() && s.peek()<=min[i])
        {
            while(!s.isEmpty() && s.peek()<=min[i])
                s.pop();
        }
            
        if(!s.isEmpty() && mid>min[i] && min[i]<s.peek() && mid>s.peek())
            return true;
       
            s.push(nums[i]);
        }
        return false;
        
    }
}