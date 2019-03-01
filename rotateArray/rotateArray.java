class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        k = k%nums.length;
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    public void reverse(int[] nums, int low, int high){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}