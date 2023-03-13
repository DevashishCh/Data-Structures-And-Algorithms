class Solution {
    void reverse(StringBuilder str,int i,int j)
    {
        while(i<j)
        {
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder(s);
        int j=str.length()-1;
        int i=j;
        boolean space=false;
        while(i>=-1)
        {
            if(i==-1 || str.charAt(i)==' ')
            {
                
                if(!space)
                {
                    reverse(str,i+1,j);
                    space=true;
                }
                else
                {
                    str.delete(i,i+1);
                }
               
            }else
            {
                if(space)
                {
                    j=i;
                    space=false;
                }
            }
            i--;
        }
        return str.reverse().toString();
    }
}