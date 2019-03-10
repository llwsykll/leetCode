class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1]!=nums.length){
            return nums.length;
        }
        if(nums[0]!=0) return 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-nums[0]!=i) {
               return i; 
            }
        }
        return -1;
    }
}