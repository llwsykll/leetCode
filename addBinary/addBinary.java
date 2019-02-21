class Solution {
    public String addBinary(String a, String b) {
        if(a.length()==0&&b.length()==0) return "0";
        StringBuilder result = new StringBuilder();
        int cc = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0||j>=0||cc!=0){
            int add = 0;
            int addA = i>=0?(a.charAt(i)=='1'?1:0):0;
            int addB = j>=0?(b.charAt(j)=='1'?1:0):0;
            
            add = addA+addB+cc;
            System.out.print(add);
            if(add>=2){
                result.append(add==3?1:0);
                cc = 1;
            }else{
                result.append(add);
                cc = 0;
            }
            i--;
            j--;
        }
        return result.reverse().toString();
        
    }
}

class Solution {
    public String addBinary(String a, String b) {
        if(a.length()==0&&b.length()==0) return "0";
        StringBuilder result = new StringBuilder();
        int cc = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0||j>=0||cc!=0){
            int add = 0;
            int addA = i>=0?(a.charAt(i)=='1'?1:0):0;
            int addB = j>=0?(b.charAt(j)=='1'?1:0):0;
            
            add = addA^addB^cc;
            cc = (addA+addB+cc)>=2?1:0;
            result.append(add);
            i--;
            j--;
        }
        return result.reverse().toString();
        
    }
}