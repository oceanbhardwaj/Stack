
class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
       
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        {
            long next=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    next=arr[j];
                    break;
                }
            }
            a[i]=next;
            
        }
        return a;
        
    } 
}
//////////////////////////////////////////////////////////
class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
       Stack<Long> s=new Stack<>();
       long a[]=new long[n];
       s.push(arr[n-1]);
       a[n-1]=-1;
       for(int i=n-2;i>=0;i--)
       {
           while(!s.isEmpty() && s.peek()<arr[i])
           {
               s.pop();
           }
           if(s.isEmpty())
           {a[i]=-1;
           }
           else
           a[i]=s.peek();
           
           s.push(arr[i]);
           
       }
       return a;
        
    } 
}