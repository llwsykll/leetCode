class Solution {
    public int findNthDigit(int n) {
        long nth = 1;
        long nrange =  9;
        if(n<=9) return n;
        while(n - nth*nrange >=0){
            n -= nth*nrange;
            nth++;
            nrange*=10;
        }
        long num = (int)Math.pow(10,(nth-1)) + (n%nth==0?n/nth-1:n/nth);
        String s = String.valueOf(num);
        int res = (int)(n%nth)==0?(int)nth-1:(int)(n%nth)-1;
        return Integer.parseInt(""+s.charAt(res));
    }
}