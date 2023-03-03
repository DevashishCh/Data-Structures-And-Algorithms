class Solution {
    public boolean canJump(int[] nums) {
        int i=nums.length,curr=nums.length-1;
        while(i-->1 ){
            if((i-1)+nums[i-1]<curr) continue;
            curr=i-1;
        }
        return curr==0;
    }
}