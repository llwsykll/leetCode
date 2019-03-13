class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] magazinec = magazine.toCharArray();
        char[] ransomNotec = ransomNote.toCharArray();
        for(char n:magazinec){
            if(map.containsKey(n)) map.put(n,map.get(n)+1);
            else map.put(n,1);
        }
        for(char n:ransomNotec){
            if(map.containsKey(n) && map.get(n)>0) map.put(n,map.get(n)-1);
            else return false;
        }
        return true;
    }
}

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}