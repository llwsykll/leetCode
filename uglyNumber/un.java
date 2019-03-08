class Solution {
    public boolean isUgly(int num) {
        if(num == 0) return false;
        int[] x = new int[]{2,3,5};
        for(int i:x){
            while(num%i == 0){
                num = num/i;
            }
        }
        return num==1;
    }
}