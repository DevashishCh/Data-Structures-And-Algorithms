class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> res = new ArrayList<>();
        addparenthesis(res, "", n, 0);
        return res;
    }

    private void addparenthesis(List<String> res, String str, int i, int j) {
        if (i==0 && j==0) {
            res.add(str);
            return;
        }

        if (j>0) addparenthesis(res, str+")", i, j-1);
        if (i>0) addparenthesis(res, str+"(", i-1, j+1);
    }
}