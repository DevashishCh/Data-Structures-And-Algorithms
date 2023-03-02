class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[n+m];
        int i=0,j=0;
        int k=0;
        while(i<n && j<m) {
            if(nums1[i]<nums2[j]) {
                ans[k]=nums1[i];
                i++;
                k++;
            }else {
                ans[k]=nums2[j];
                k++;j++;
            }
        }
        while(i<n) {
             ans[k]=nums1[i];
                i++;
                k++;
        }
        while(j<m) {
             ans[k]=nums2[j];
                k++;j++;
        }
        if((m+n)%2==0) {
            return (double)((double)ans[(m+n)/2-1]+(double)ans[(n+m)/2])/2.0;
        }else {
            return ans[(m+n)/2];
    }
}
}