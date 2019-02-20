class Solution {

    /**
     * @param String $haystack
     * @param String $needle
     * @return Integer
     */
    function strStr($haystack, $needle) {
        if(strlen($needle)==0){
            return 0;
        }else{
            echo strpos($haystack,$needle);
            if(strpos($haystack,$needle)===false){
                return -1;
            }
            return strpos($haystack,$needle);
        }
    }
}