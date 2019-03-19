class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i = 1;i<=n;i++){
            boolean a = (i%3==0);
            boolean b = (i%5==0);
            if(a &&!b) res.add("Fizz");
            if(!a&&b) res.add("Buzz");
            if(a&&b) res.add("FizzBuzz");
            if(!a&&!b) res.add(Integer.toString(i));
        }
        return res;
    }
}