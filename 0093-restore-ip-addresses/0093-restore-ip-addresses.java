class Solution {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if(s.length()>12) return res;
        recursion(0,s,"",0);
        return res;
    }
    private void recursion(int idx, String str, String temp,int part){
        if(idx == str.length() || part == 4){
            if(idx == str.length() && part == 4) res.add(temp.substring(0, temp.length()-1));
            return;
        }
        recursion(idx+1,str,temp+str.charAt(idx)+".",part+1);
        if(idx+2<=str.length() && isValid(str.substring(idx, idx+2))) recursion(idx+2, str, temp+str.substring(idx, idx+2)+".", part+1);
        if(idx+3<=str.length() && isValid(str.substring(idx, idx+3))) recursion(idx+3, str, temp+str.substring(idx, idx+3)+".", part+1);
    }
    private boolean isValid(String str){
        if(str.charAt(0) == '0') return false;
        return Integer.parseInt(str)<=255;
    }
}