class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int left=-1;
            int right=n;
            int d=heights[i];
        //left smaller
            for(int j=i-1;j>=0;j--)
            {
                if(heights[j]<d)
                {
                    left=j;
                    break;
                }
            }
            //right smaller
            for(int k=i+1;k<n;k++)
            {
                if(heights[k]<d)
                {
                    right=k;
                    break;
                }
            }
        max=Math.max((right-left-1)*heights[i],max);
        
        
        
        }
        return max;
        
    }
}
/////////////////////////////////////o(n2)///////////////////
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int min=-1;
        left[0]=-1;
        for(int i=0;i<n;i++)
        { min=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(heights[j]<heights[i])
                {
                    min=j;
                    break;
                }
            }
            left[i]=min;
        }
        min=n;
        
        for(int i=0;i<n;i++)
        { min=n;
            for(int j=i+1;j<n;j++)
            {
                if(heights[j]<heights[i])
                {
                    min=j;
                    break;
                }
            }
            right[i]=min;
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(heights[i]*(right[i]-left[i]-1),max);
        }
        return max;
    }
}
////////////////////////////////////////////0(n)///////////////////
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int min=-1;
        left[0]=-1;
        right[n-1]=n;
       Stack<Integer> s=new Stack<>();
        //left smaller
        s.push(0);
        for(int i=1;i<n;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                s.pop();
            if(s.isEmpty())
                left[i]=-1;
            else
                left[i]=s.peek();
            s.push(i);
        }
        s=new Stack<>();
        s.push(n-1);
        right[n-1]=n;
        
         for(int i=n-2;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                s.pop();
            if(s.isEmpty())
                right[i]=n;
            else
                right[i]=s.peek();
             s.push(i);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        long max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(heights[i]*(right[i]-left[i]-1),max);
        }
        return (int)max;
        
    }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}
