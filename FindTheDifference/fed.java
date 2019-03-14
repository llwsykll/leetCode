class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.containsKey(c) && map.get(c)>0) map.put(c,map.get(c)-1);
            else return c;
        }
        return 'a';
    }
}

class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for(int i = 0;i<26;i++){
            arr[i] = 0;
        }
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(arr[c-'a']<1) return c;
            arr[c-'a']--;
        }
        return 'a';
    }
}