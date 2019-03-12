class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i:nums1){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        for(int j:nums2){
            if(map.containsKey(j) && map.get(j)>=1){
                result.add(j);
                map.put(j,map.get(j)-1);
            }
        }
        int i =0;
        int[] re = new int[result.size()];
        for(int n:result){
            re[i++] = n;
        }
        return re;
    }
}