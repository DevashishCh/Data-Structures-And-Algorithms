class Solution {
    public class Pair {
        String s;
        int t;
        Pair (String s, int t) {
            this.s = s;
            this.t = t;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dic = new HashSet<>();
        for (String wl : wordList) {
            dic.add(wl);
        }
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        HashSet<String> hs = new HashSet<>();
        while (q.size() > 0) {
            // rm m* w a*
            Pair rm = q.remove();
            
            if (hs.contains(rm.s)) continue;
            hs.add(rm.s);
            
            if (rm.s.equals(endWord)) return rm.t;
            
            
            String rohit = rm.s;
          
            for (int i = 0; i < rm.s.length(); i++) {
                StringBuilder s = new StringBuilder(rohit);
               
                
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    s.replace(i, i + 1, ch + "");
                    
                    if (dic.contains(s.toString()) && hs.contains(s.toString()) == false) {
                        System.out.println(s + " in");
                        q.add(new Pair(s.toString(), rm.t + 1));
                    }
                }
            }
            
        }
        return 0;
    }
}