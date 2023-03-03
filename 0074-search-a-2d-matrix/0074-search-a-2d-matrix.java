class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
         int rowPointer = 0;
        int colPointer = matrix[0].length-1;
        while(rowPointer < matrix.length && colPointer >= 0){
            if(matrix[rowPointer][colPointer] == target) return true;
            else if(matrix[rowPointer][colPointer] > target) colPointer--;
            else rowPointer++;
        }
        return false;
    }
}