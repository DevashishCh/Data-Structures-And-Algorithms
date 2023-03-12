class Solution {
    public boolean isPalindrome(String s) {
      int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90
                    || (int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122 || (int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57 ) {
                ans += Character.toLowerCase(s.charAt(i));
            }
        }
        // System.out.println(ans);
        int i = 0, j = ans.length() - 1;
        while (i < j) {
            if (ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}