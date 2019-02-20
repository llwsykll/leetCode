class Solution {
    public String countAndSay(int n) {
        int i=1;
        String re =  "1";
        String newRe = "";
        while(i<n){
            int count=1;
            char c = re.charAt(0);
            for(int m=1;m<re.length();m++){
                if(c==re.charAt(m)){
                    count++;
                }
                else{
                    newRe += ""+count+""+c;
                    c=re.charAt(m);
                    count=1;
                }
            }
            newRe += ""+count+""+c;
            re = newRe;
            newRe = "";
            i++;
        }
        return re;
    }
}

class Solution {
    public String countAndSay(int n) {
        int i=1;
        String re =  "1";
        StringBuilder newRe = new StringBuilder();
        while(i<n){
            int count=1;
            char c = re.charAt(0);
            for(int m=1;m<re.length();m++){
                if(c==re.charAt(m)){
                    count++;
                }
                else{
                    newRe.append(count);
                    newRe.append(c);
                    c=re.charAt(m);
                    count=1;
                }
            }
            newRe.append(count);
                    newRe.append(c);
            re = newRe.toString();
            newRe =new StringBuilder();
            i++;
        }
        return re;
    }
}