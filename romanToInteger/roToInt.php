class Solution {

/**
 * @param String $s
 * @return Integer
 */
function romanToInt($s) {
    $arr = array("I"=>1,
                "V"=>5,
                "X"=>10,
                "L"=>50,
                "C"=>100,
                "D"=>500,
                "M"=>1000);
    $sum = 0;
    for($i=0;$i<strlen($s);$i++){
        if($arr[substr($s,$i,1)]<$arr[substr($s,$i+1,1)]){
            $sum-=$arr[substr($s,$i,1)];
        }
        else{
            $sum+=$arr[substr($s,$i,1)];
        }
    }
    return $sum;
}
}