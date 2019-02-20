class Solution {

/**
 * @param String $s
 * @return Integer
 */
function lengthOfLastWord($s) {
    $s = rtrim($s);
    $sArr = explode(' ',$s);
    return strlen($sArr[count($sArr)-1]);
}
}