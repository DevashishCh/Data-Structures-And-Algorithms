class Solution {
    public int trap(int[] height) {
        int water=0,left,right;
        int n=height.length;
        left=0;
        for(int i=1;i<n-1;i++) {
            
            right=0;
            // for(int j=i-1;j>=0;j--) {
            //     if(height[j]>left) {
            //         left=height[j];
            //     }
            // }
            if(left<height[i-1]) {
                left=height[i-1];
            }
            for(int j=i+1;j<n;j++) {
                if(height[j]>right) {
                    right=height[j];
                }
             }
            if(left>height[i] && right>height[i]) {
                if(left>=right) {
                    water+=right-height[i];
                }else {
                    water+=left-height[i];
                }
            }
        }
         return water;
    }
}