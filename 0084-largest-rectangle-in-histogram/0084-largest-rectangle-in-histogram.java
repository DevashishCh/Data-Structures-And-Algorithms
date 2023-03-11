class Solution {
    public int largestRectangleArea(int[] heights) {
         int rs[]=new int[heights.length];
        int ls[]=new int [heights.length];
        Stack<Integer>st=new Stack<>();
        rs[heights.length-1]=heights.length;
        st.push(heights.length-1);
        for(int i=heights.length-2;i>=0;i--){
             while(st.size()>0 && heights[st.peek()]>=heights[i])st.pop();
             if(st.size()==0)rs[i]=(heights.length);
             else rs[i]=st.peek();  
             st.push(i);
        }
        st.clear();
        ls[0]=-1;
        st.push(0);
        for(int i=1;i<heights.length;i++){
             while(st.size()>0 && heights[st.peek()]>=heights[i])st.pop();
             if(st.size()==0)ls[i]=(-1);
             else ls[i]=st.peek();           
             st.push(i);
        }
               int maxarea=0;
     for(int i=0;i<heights.length;i++){
          maxarea=Math.max(maxarea,(rs[i]-ls[i]-1)*heights[i]);

     }
     return maxarea;
    }
}