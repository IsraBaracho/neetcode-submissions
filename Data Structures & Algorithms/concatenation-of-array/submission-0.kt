class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(2*n) { 0 }

        for (i in 0.. ans.size - 1){
            if(i < n){
                ans[i] = nums[i]
            } else {
                ans[i] = nums[i - n]
            }

        }

        return ans
    }
}
