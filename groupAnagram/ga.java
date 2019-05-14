class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<String, List<String>>();
        for(String s: strs){
            char[] l = s.toCharArray();
            Arrays.sort(l);
            String news = String.valueOf(l);
            if(!res.containsKey(news)){
                res.put(news, new ArrayList<String>());
            }
            res.get(news).add(s);
        }
        return new ArrayList<List<String>>(res.values());
    }
}