class Solution {
    public List<String> letterCombinations(String digits) {
        char[][] array = new char[][]{
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
        };
        List<String> res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        for(char c: array[(int)digits.charAt(0)-48-2]){
            res.add(String.valueOf(c));
        }
        for(int i = 1; i < digits.length(); i++){
            List<String> row = new ArrayList<>();
            for(String re: res){
 
                for(char c: array[(int)digits.charAt(i)-48-2]){
                    String newS = re + c;
                    row.add(newS);
                }
            }
            res = row;
        }
        return res;
    }
}