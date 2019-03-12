class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<1) return false;
        return (Math.log10(num)/Math.log10(4))%1 == 0;
    }
}