package sumOfTwo

fun main(){
    val array = intArrayOf(2,7,11,15)
    val resutlArray = twoSum(array, 9)
    for(item in resutlArray) {
        print (item)
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for(i in nums.indices){
        for( j in i until nums.size){
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return  intArrayOf()
}