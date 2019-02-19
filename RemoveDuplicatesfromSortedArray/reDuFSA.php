class Solution {

/**
 * @param Integer[] $nums
 * @return Integer
 */
function removeDuplicates(&$nums) {
    $numNew = [];
    $numNew[] = $nums[0];
    for($i=1;$i<count($nums);$i++){
        if($nums[$i]!=$nums[$i-1]){
            $numNew[] = $nums[$i];
        }
    }
    $nums = $numNew;
    return count($numNew);
}
}