class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i1:nums1) set1.add(i1);
        for(int i2:nums2) set2.add(i2);
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for(int re:set1) result[i++] = re;
        return result;
        
    }
}