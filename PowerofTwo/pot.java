class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        String s = Integer.toBinaryString(n);
        int Len = s.length();
        String s1 = s.replaceAll("1","");         
        return Len-s1.length() == 1;
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        String s = Integer.toBinaryString(n);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') sum++;
        }
        return sum==1;
    }
}