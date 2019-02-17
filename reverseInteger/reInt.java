class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x!= 0){
            int re = x%10;
            
            int newRe = result*10+re;
            if((newRe-re)/10 != result){
                return 0;
            }
            result = newRe;
            x = x / 10;
        }
        return result;
    }
}