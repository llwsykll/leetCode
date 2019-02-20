class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        else{
            return haystack.indexOf(needle);
        }
    }
}