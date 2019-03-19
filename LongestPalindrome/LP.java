class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        int res = 0;
        for(Integer value:map.values()){
            res +=value - value%2;
            if(res%2==0 && value%2==1){
                res++;
            }
        }
        return res;
    }
}


class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        int res = 0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int c:arr){
            res+=c-c%2;
            if(res%2==0&&c%2==1) res++;
        }
        return res;
    }
}