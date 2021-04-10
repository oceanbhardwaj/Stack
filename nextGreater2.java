class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int n1=2*n;
        for(int i=0;i<n;i++)
        {
            int d=i%n;
            int next=-1;
            for(int j=i+1;j<n1;j++)
            {
                if(nums[j%n]>nums[i%n])
                {
                    next=nums[j%n];
                    break;
                }
            }
            arr[i%n]=next;
        }
        return arr;
        
    }
}


////////////////////////////////////////////////////////
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int n=nums.length;
        int nums1[]=new int[2*n];
        int n1=2*n;
        for(int i=0;i<n;i++)
        {
            nums1[i]=nums[i];
            nums1[i+n]=nums[i];
        }
        
        int arr[]=new int[n1];
        arr[n1-1]=-1;
        s.push(nums1[n1-1]);
        for(int i=n1-2;i>=0;i--)
        {
            while(!s.isEmpty() && nums1[i]>=s.peek())
                s.pop();
            if(s.isEmpty())
                arr[i]=-1;
            else
                arr[i]=s.peek();
            s.push(nums1[i]);
        }
        return Arrays.copyOf(arr,n);
    }
}






////////////////////////////////////////////////////

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int n=nums.length;
        //int nums1[]=new int[2*n];
        int n1=2*n;
       
        
        int arr[]=new int[n];
        arr[n-1]=-1;
        s.push(nums[n-1]);
        for(int i=n1-2
            ;i>=0;i--)
        { int d=i%n;
            while(!s.isEmpty() && nums[d%n]>=s.peek())
                s.pop();
            if(s.isEmpty())
                arr[d%n]=-1;
            else
                arr[d%n]=s.peek();
            s.push(nums[d%n]);
        }
        return arr;
    }
}