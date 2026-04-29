class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var numberChosen = nums[0]

        for(i in 0 until nums.size){
            if(count == 0){
                numberChosen = nums[i]
                count++
            } else if ( nums[i] == numberChosen){
                count++
            } else {
                count --
            }
        }
        return numberChosen
    }
}
