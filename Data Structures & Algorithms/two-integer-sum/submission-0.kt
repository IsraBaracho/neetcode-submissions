class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            val complement = target - num
            if (complement in map) return intArrayOf(map[complement]!!, i)
            map[num] = i
        }
        return intArrayOf()
    }
}
