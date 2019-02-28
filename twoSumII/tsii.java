class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.get(target - nums[i])!=null){
                res[0] = map.get(target - nums[i])+1;
                res[1] = i+1;
                return res;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}