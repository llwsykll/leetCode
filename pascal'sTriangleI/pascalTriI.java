class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> nums = new ArrayList<List<Integer>>();
        if(numRows < 1) return nums;
        for(int i=0;i<numRows;i++){
            List<Integer> num = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j == i) num.add(1);
                else{
                   num.add(nums.get(i-1).get(j-1) + nums.get(i-1).get(j)); 
                } 
            }
            nums.add(num);
        }
        return nums;
    }
}