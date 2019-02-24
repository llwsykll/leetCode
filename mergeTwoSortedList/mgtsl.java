class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1;
        m--;
        n--;
        while(m>-1 || n>-1){
            if(m>-1&&n>-1){
                if(nums1[m]>nums2[n]){
                    nums1[i]=nums1[m];
                    m--;
                }else{
                    nums1[i]=nums2[n];
                    n--;
                }
            }       
            else if(m<0){
                nums1[i]=nums2[n];
                n--;
            }
            else{
                nums1[i]=nums1[m];
                m--;
            }
            i--;
        }   
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1;
        for(int nn:nums2){
            nums1[i]=nn;
            i--;
        }  
        Arrays.sort(nums1);
    }
}