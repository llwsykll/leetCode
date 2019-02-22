class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
    function climbStairs($n) {
        if($n<=2){return $n;}
        $a = 1;
        $b = 2;
        for($i=2;$i<$n;$i++){
            $temp = $b;
            $b+=$a;
            $a=$temp;
        }
        return $b;
    }
}