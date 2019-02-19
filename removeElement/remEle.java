class Solution {
    public int removeElement(int[] nums, int val) {
        int len=0;
        for(int n : nums){
            if(n!=val){
                nums[len]=n;
                len++;
            }
        }
        return len;
    }
}