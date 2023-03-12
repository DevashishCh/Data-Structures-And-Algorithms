class Solution {
    public List<Integer> getRow(int rowIndex) {
     ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> copy = new ArrayList<>();
        for(int i = 0; i<=rowIndex; i++){
            ArrayList<Integer> inside = new ArrayList<>();
            for (int j =0 ; j<=i ; j++){
                if(j == 0 || j == i){
                    inside.add(j,1);
                }
                else {
                    inside.add(j,copy.get(j) + copy.get(j-1));
                }   
            }
            copy = inside;
            list.add(i,inside);
        }

        return list.get(rowIndex);

        
    }
}