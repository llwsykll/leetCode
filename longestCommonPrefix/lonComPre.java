class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){return "";}        
            String common = strs[0];
        int m=0;
        while(m<strs[0].length()){
            for(int i=1;i<strs.length;i++){
                if(strs[i].indexOf(common)!=0){
                    common = common.substring(0,common.length()-1);
                    break;
                }
            }
            m++;
        }
        return common;
    }
}