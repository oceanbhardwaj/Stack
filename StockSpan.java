class Solution{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i-1;j>=0;j--)
            {
                if(price[j]<=price[i])
                count++;
                else
                break;
            }
            arr[i]=count;
        }
        return arr;
    }
    
}
////////////////////////////////////////////////////////////
class Solution{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i-1;j>=0;j--)
            {
                if(price[j]<=price[i])
                count++;
                else
                break;
            }
            arr[i]=count;
        }
        return arr;
    }
    
}
///////////////////////////////////////////////////////////////////Stack//////////////////////////////////////////
class Solution{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        int arr[]=new int[n];
        //next greater element
        Stack<Integer> s=new Stack<>();
        arr[0]=1;
        s.push(0);
        int c=0;
        for(int i=1;i<n;i++)
        {
           while(!s.isEmpty() && price[s.peek()]<=price[i])
           {
               s.pop();
               //c=i-s.peek();
           }
           if(s.isEmpty())
           c=i+1;
           else
           c=i-s.peek();
            
            arr[i]=c;
            s.push(i);
            
            
            
        }
            
        return arr;
    }
    
}