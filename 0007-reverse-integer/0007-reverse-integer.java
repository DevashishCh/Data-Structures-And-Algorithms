class Solution {
    public int reverse(int x) {
       long rev=0,rem;
        while(x != 0){
            rem=x%10;
            x = x/10;
            rev= rev * 10 + rem;
        }
        if(rev <= -Math.pow(2,31) || rev >= Math.pow(2,31)-1){
            rev =0;
        }
        return  (int)rev;
    }
}

