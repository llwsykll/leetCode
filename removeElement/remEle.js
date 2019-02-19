/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    var length = nums.length;
    var isTrue=0;
    for(var i=0;i<nums.length;i++){
        if(nums[i]==val){
            nums.splice(i,1);//从位置i开始删除1个
            i--;
        }
    }
    return nums.length;
};