class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        String vowels = "eaiouAEIOU";
        char[] li = s.toCharArray();
        while(left<right){
            if(vowels.contains(li[left]+"") && vowels.contains(li[right]+"")){
                char temp = li[left];
                li[left] = li[right];
                li[right] = temp;
                left++;
                right--;
            }
            if(!vowels.contains(li[left]+"")) left++;
            if(!vowels.contains(li[right]+"")) right--;
        }
        return new String(li);
    }
}