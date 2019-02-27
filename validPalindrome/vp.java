class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        while(i<j){
            char si = s.charAt(i);
            char sj = s.charAt(j);
            if(!Character.isLetterOrDigit(si)){
                i++;
                continue;
            } 
            if(!Character.isLetterOrDigit(sj)){
                j--; 
                continue;
            } 
            if(Character.toLowerCase(si) != Character.toLowerCase(sj)) return false;
            i++;
            j--;
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        StringBuilder newS = new StringBuilder();
        for(;i<s.length();i++){
            char si = s.charAt(i);
            if(Character.isLetterOrDigit(si)) newS.append(Character.toLowerCase(si));
        }
        String newSS = new String();
        newSS = newS.toString();
        String newSSS = newS.reverse().toString();
        if(!newSSS.equals(newSS)) return false;
        return true;
    }
}