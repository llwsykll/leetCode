class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int j = 1;
        int res = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                res = nums[i];
                j++;
            }
            if(j == 3){
                return res;
            }
        }
        return nums[nums.length-1];
    }
}