class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */

    function twoSum($nums, $target) {
        $result = [];
        for($i=0;$i<count($nums);$i++){
            for($j=$i+1;$j<count($nums);$j++){
                if($nums[$i]+$nums[$j] == $target){
                    $result = [$i,$j];
                    return $result;
                }
            }
        }
        if(count($result==0)){
            return false;
        }
    }

}