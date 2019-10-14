class ESCT {
    public String convertToTitle(int n) {
        String[] arr=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        StringBuilder res = new StringBuilder();
        while(n>26){
            int nn = n%26;
            int nm = n/26;
            res.append(nn==0?arr[arr.length-1]:arr[nn-1]);
            n = nn==0?nm-1:nm;
        }
        res.append(arr[n-1]);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        ESCT a = new ESCT();
        String res = a.convertToTitle(1);
        System.out.println(res);
    }
}