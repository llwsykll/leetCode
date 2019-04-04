class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String[] res = new String[numRows];
        for(int j=0;j<res.length;j++){
            res[j] = "";
        }
        int n = numRows - 1;
        boolean top = true;
        for(int i = 0;i<s.length();i++){
            if(top){
                if(i%n==0){
                    res[0] += s.charAt(i);
                    top = false;
                }
                else{
                    res[n-i%n] += s.charAt(i);
                }
            }
            else{
                if(i%n==0){
                    res[n] += s.charAt(i);
                    top = true;
                }
                else{
                    res[i%n] += s.charAt(i);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(String r:res){
            result.append(r);
        }
        return result.toString();
    }
}