class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for(i in 0.. nums.size - 1){
            if(map.containsKey(nums[i])){
                return true
            } else {
                map[nums[i]] = 1
            }
        }

        return false
    }
}
