class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1 && s.charAt(0)!=' '){
            return 1;
        }
        int n=s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(n-i!=0 && s.charAt(i+1)!=' '){
                    
                    return n-i;
                } 
                else n=i-1;    
            }
        }
        if(s.charAt(0)!=' '){
            
            return n+1;
        }
        return 0;
    }
    
}