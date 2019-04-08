class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.length()==0){
            return 0;
        }
        int n = 0;
        int i = 0;
        boolean sign = true;
        if(str.charAt(0) == '-'){
            sign = false;
            i ++;
        }
        if(str.charAt(0) == '+'){
            i ++;
        }
        while(i<str.length()){
            if(Character.isDigit(str.charAt(i))){
                int cur = str.charAt(i)-'0';
                if(n>(Integer.MAX_VALUE-cur)/10){
                    return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                n = n*10 + cur;
                i++;
            }
            else{
                break;
            }
        }
        return sign?n:(-1)*n;
    }
}