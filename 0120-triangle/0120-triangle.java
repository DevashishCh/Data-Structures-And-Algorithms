class Solution {
  
    public int solve(List<List<Integer>> triangle,int i,int j,int[][] dp){
        if(i==triangle.size()-1) return triangle.get(i).get(j);
if(i>=triangle.size()-1 || j>=triangle.get(triangle.size()-1).size()) return (int)Math.pow(10,9);
if(dp[i][j]!=-1) return dp[i][j];
int down=triangle.get(i).get(j)+solve(triangle,i+1,j,dp);
int diag=triangle.get(i).get(j)+solve(triangle,i+1,j+1,dp);
return dp[i][j]=Math.min(down,diag);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int[]row:dp) Arrays.fill(row,-1);
       return solve(triangle,0,0,dp);
    }
}