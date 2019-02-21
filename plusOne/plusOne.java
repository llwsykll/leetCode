class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]==9){
            int i = digits.length;
            StringBuilder str = new StringBuilder();
            while(i>0){
                i--;
                if(digits[i]==9){
                    digits[i]=0;
                    if(i==0){
                        int[] newDigits = new int[digits.length+1];
                        for(int j = newDigits.length-1;j>0;j--){
                            newDigits[j]=digits[j-1];
                        }
                        newDigits[0]=1;
                        digits = newDigits;
                    }
                }
                else{
                    digits[i]++;
                    break;
                }
            }
        }
        else{
            digits[digits.length-1]++;
        }
        return digits;
    }
}