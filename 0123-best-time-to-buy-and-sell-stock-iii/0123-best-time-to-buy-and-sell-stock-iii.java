class Solution {
    int[][][] ans;
    public int maxProfit(int[] prices) {
        ans = new int[3][prices.length+1][3];
        for(int[][] k:ans)
            for(int[] l:k)
                Arrays.fill(l,-1);
        return rec(2,prices,0,true,0);
    }
    int rec(int k,int[] prices, int n, boolean buyorsell,int bs)
    {
        if(k==0) return 0;
        if(n==prices.length) return 0;
        if(ans[k][n][bs]!=-1) return ans[k][n][bs];

        // he can only buy
        if(buyorsell)
        {
            ans[k][n][bs]= Math.max(rec(k,prices,n+1,false,1)-prices[n],rec(k,prices,n+1,true,0));       
            return ans[k][n][bs];    
        }
        else
        {
            ans[k][n][bs] = Math.max(rec(k-1,prices,n+1,true,0)+prices[n],rec(k,prices,n+1,false,1));
            return ans[k][n][bs];   
        }
    }
}