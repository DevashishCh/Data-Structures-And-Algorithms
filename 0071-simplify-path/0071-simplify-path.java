class Solution {
     public String simplifyPath(String path) {
        String[] split = path.trim().split("/");
        StringBuilder sb = new StringBuilder();
        List<String> pathRes = new ArrayList<>();
        for (String s : split) {
            if (s.isEmpty()) continue;
            if (s.equals("..")) {
                if (pathRes.size() > 0)
                    pathRes.remove(pathRes.size() - 1);
                if (pathRes.size() > 0)
                    pathRes.remove(pathRes.size() - 1);
            } else if (!s.equals(".")) {
                pathRes.add("/");
                pathRes.add(s);
            }
        }
        for (String s : pathRes)
            sb.append(s);
        return sb.length() == 0 ? "/" : sb.toString();
    }
}