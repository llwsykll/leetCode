class Solution {
    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        while(b!=0){
            int c = a&b;
            a = a^b;
            b = c<<1;            
        }
        return a;
    }
}