class Solution {

/**
 * @param Integer $x
 * @return Integer
 */
function reverse($x) {
    $max = pow(2,31)-1;
    $min = 0-pow(2,31);
    if($x>=$max || $x<=$min){
        return 0;
    }
    $z = 0;
    $result = '';
    $arr = array();
    if($x<0){
        $z=1;
        $x = abs($x);
    }
    $length = strlen($x);
    for($i=$length;$i>0;$i--){
        $s = pow(10,$i-1);
        $arr[$i] = intval(floor($x/$s));
        $x = $x%$s;
    }
    for($m=0;$m<=$length;$m++){
        $result = $result.$arr[$m];
    }
    $result = (int)$result;
    if($z==1){
        $result = 0-$result;
    }
    if($result>=$max || $result<=$min){
        return 0;
    }
    return $result;
}
}