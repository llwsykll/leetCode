class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if (map.get(target - nums[i])!=null) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            return result;
        }
            map.put(nums[i], i);
    }
    return result;
    }
}
//之前的算法都是前数固定，加后数判断
//这个是后数固定，判断是否存在以存入map中的前数相加符合条件