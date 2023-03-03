class Solution {
    public int maxSubArray(int[] nums) {
          int cs=0;
        int maxs=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            cs+=nums[i];
            if(cs>maxs) {
                maxs=cs;
            }
            if(cs<0) {
                cs=0;
            }
        }
        return maxs;
    }
}