class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int pm=0;
        for(int i=1;i<n;i++) {
            int p=prices[i]-min;
            if(p>pm) pm=p;
            min=Math.min(prices[i],min);
        }
        return pm;
    }
}