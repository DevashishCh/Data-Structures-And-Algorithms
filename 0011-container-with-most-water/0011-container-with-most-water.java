class Solution {
    public int maxArea(int[] height) {
         int max=0;
        int s=0,e=height.length-1;
        while(s<e) {
            int min=Math.min(height[s],height[e]);
            int pro=min*(e-s);
            if(pro>max) {
                max=pro;
            }
            if(height[s]>height[e]) {
                e--;
            }else {
                s++;
            }
        }
        return max;
    }
}