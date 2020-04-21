package HowManyNumSmallerThenCurrentNum

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var arr = Array(nums.size) {0}
    for(i in nums.indices){
        for(j in nums.indices){
            if(nums[j] < nums[i])
                arr[i]++;
        }
    }
    return arr.toIntArray();
}