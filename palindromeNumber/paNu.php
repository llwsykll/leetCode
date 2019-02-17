class Solution {

/**
 * @param Integer $x
 * @return Boolean
 */
function isPalindrome($x) {
    $arr = array();
    if($x<0){
        return false;
    }
    $length = strlen($x);
    for($i=$length;$i>0;$i--){
        $s = pow(10,$i-1);
        $arr[$i-1] = intval(floor($x/$s));
        $x = $x%$s;
    }
    for($m=0;$m<$length/2;$m++){
        if($arr[$m]==$arr[$length-$m-1]){
            continue;
        }
        else{
            return false;
        }
    }
    return true;
}
}