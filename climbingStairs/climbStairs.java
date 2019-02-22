// java当入参较大时返回数据为负数，实际是不对的
// 数组
class Solution {
    public int climbStairs(int n) {
        if(n<=2){return n;}
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for(int i=2;i<=n-1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
}

// 不用数组
class Solution {
    public int climbStairs(int n) {
        if(n<=2){return n;}
        int a = 1;
        int b = 2;
        for(int i=2;i<=n-1;i++){
            int temp = b;
            b = a+b;
            a = temp;
        }
        return b;
    }
}