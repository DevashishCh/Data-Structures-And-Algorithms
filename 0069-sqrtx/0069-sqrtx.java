class Solution {
    public int mySqrt(int x) {
         int sqrt=0;
        int i=1;
        while(x>0){
            x-=i;
            if(x<0) break;
            i+=2;
            sqrt++;
        }
        return sqrt;
    }
}