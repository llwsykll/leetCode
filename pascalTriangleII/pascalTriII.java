class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> nums = new ArrayList<List<Integer>>();
        for(int i=0;i<rowIndex+1;i++){
            List<Integer> num = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j == i) num.add(1);
                else{
                   num.add(nums.get(i-1).get(j-1) + nums.get(i-1).get(j)); 
                } 
            }
            nums.add(num);
        }
        return nums.get(rowIndex);
    }
}    