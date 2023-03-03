class Solution {
    public int removeElement(int[] nums, int val) {
        int var =0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==val) {
                var++;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=val) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }else {
                continue;
            }
        }
        return nums.length-var;
    }
}