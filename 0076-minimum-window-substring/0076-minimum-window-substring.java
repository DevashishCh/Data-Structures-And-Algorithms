class Solution {
      public String minWindow(String s, String t) {
        int m=s.length(),n=t.length();
        String ans="";
        if(n>m || n==0 || m==0){
            return "";
        }
        
        //for frequency of chars in string t
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<n;i++){
            hm1.put(t.charAt(i),hm1.getOrDefault(t.charAt(i),0)+1);
        }
        
        //for freq of chars in string s
        HashMap<Character,Integer> hm2=new HashMap<>();
        int start=0,end=0;
        int matchCount=0;
        int minLen=Integer.MAX_VALUE,minStart=0;
        
        while(end<m){
            
            //acquire characters
            char ch=s.charAt(end);
            if(hm1.containsKey(ch)){
                if(hm2.containsKey(ch)){
                    if(hm2.get(ch)<hm1.get(ch)){
                        matchCount++;
                    }
                    hm2.put(ch,hm2.get(ch)+1);
                }
                else{
                    matchCount++;
                    hm2.put(ch,1);
                }
            }
            end++;
            
            //release chracters till matchCount=n and update length after each char
            while(matchCount==n){
                if((end-start)<minLen){
                    minLen=end-start;
                    minStart=start;
                }
                char chS=s.charAt(start);
                if(hm1.containsKey(chS)){
                    if(hm2.get(chS)>hm1.get(chS)){
                        hm2.put(chS,hm2.get(chS)-1);
                    }
                    else{
                        hm2.put(chS,hm2.get(chS)-1);
                        matchCount--;
                    }
                }
                start++;
            }
            
        }
        
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(minStart,minStart+minLen);
    }
}