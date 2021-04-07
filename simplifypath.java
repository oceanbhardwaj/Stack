class Solution {
    public String simplifyPath(String path) {
    String s=path.replaceAll("//","/");
        
        Stack<String> s1=new Stack<>();
        String str[]=s.split("/");
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]);
        for(int i=0;i<str.length;i++)
        {
            if(!s1.isEmpty() && str[i].equals(".."))
                s1.pop();
            else if(!str[i].equals(".") && !str[i].equals("..") && !str[i].equals(""))
                s1.push(str[i]);
        }
        StringBuilder sb=new StringBuilder();
        ArrayList<String> a=new ArrayList<>();
      while(!s1.isEmpty())
           a.add(s1.pop());
       int i=0;
        int j=a.size()-1;
        while(i<j)
        {
            String temp1=a.get(i);
           String temp2=a.get(j);
            a.set(i,temp2);
            a.set(j,temp1);
            i++;
            j--;
        }
        String s3="";
        for(String i1:a)
        { if(!i1.equals(""))
            s3=s3+i1+"/";}
        return s3.length()==0?"/":"/"+s3.substring(0,s3.length()-1);
    }
}