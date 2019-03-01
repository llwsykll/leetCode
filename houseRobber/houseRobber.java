class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int prev1 = 0;
        int prev2 = 0;
        for(int i=0;i<nums.length;i++){
            int temp = prev1;
            prev1 = Math.max(prev1,prev2+nums[i]);
            prev2 = temp;
        }
        return prev1;
    }
}

class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int[] maxx = new int[nums.length+1];
        maxx[0] = 0;
        maxx[1] = nums[0];
        for(int i = 1;i<nums.length;i++){
            maxx[i+1] = Math.max(maxx[i],maxx[i-1]+nums[i]);
        }
        return maxx[nums.length];
    }
}