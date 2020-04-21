package medianOfTwoArray

fun main(){
    val arr = intArrayOf(1,9,9)
    val resultArray = plusOne(arr)
    for (i in resultArray){
        print(i)
    }
}

fun plusOne(array: IntArray): IntArray { /// write your Code here
    var carry = false
    array[array.size -1 ] ++
    //check carry
    for(i in array.size-1 downTo 0){

        if(carry) {
            array[i] ++
            carry = false
        }
        if(array[i] > 9) {
            carry = true
            array[i] = array[i] % 10
        }

        if (!carry) break
    }

    if(carry) {
        val newArray = IntArray(array.size+1)
        newArray[0] = 1
        for(i in array.indices){
            newArray[i+1] = array[i]
        }
        return newArray
    }
    return array
}