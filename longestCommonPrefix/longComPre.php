class Solution {

    /**
     * @param String[] $strs
     * @return String
     */
    function longestCommonPrefix($strs) {
        if(count($strs)>0){
            $common = $strs[0];
        }else{
            return '';
        }
        for($i=0;$i<strlen($strs[0]);$i++){
            foreach ($strs as $str){
                // if(strlen(strpos($str,$common))==0){
                //     $common = substr($common,0,-1);
                //     break;
                // }
                if(strpos($str,$common)===0){
                    continue;
                }else{
                    $common = substr($common,0,-1);
                    break;
                }
            }
        }
        return $common;
    }
}

//php判断是否等于数字0要用===，或者先判断长度是否为0，为0则是空串
//判断比===快