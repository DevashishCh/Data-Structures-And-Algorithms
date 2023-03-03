class Solution {
    
    List<List<Integer>> solutions = new ArrayList<>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        permute(new LinkedList<>(), map);
        return solutions;
        
    }
    
    public void permute(List<Integer> curr, HashMap<Integer, Integer> left){
        if (left.size() == 0){
            solutions.add(new ArrayList<>(curr));
            return;
        }
        Set<Integer> set = new HashSet<>(left.keySet());
        for (int i: set){
            curr.add(i);
            if (!left.remove(i, 1)) left.replace(i, left.get(i) - 1);
            permute(curr, left);
            curr.remove(curr.size() - 1);
            left.put(i, left.getOrDefault(i, 0) + 1);
        }
    }
}