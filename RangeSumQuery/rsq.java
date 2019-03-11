class NumArray {
    private int[] data ;
    public NumArray(int[] nums) {
        if(nums.length == 0) return ;
        data = new int[nums.length];
        data[0] = nums[0];
        for(int i = 1; i<nums.length;i++){
            data[i] = nums[i] + data[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
        return i==0?data[j]:data[j]-data[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */